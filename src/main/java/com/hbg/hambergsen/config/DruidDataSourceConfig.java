package com.hbg.hambergsen.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;
import com.alibaba.druid.util.JdbcConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * [ 数据源配置 ]
 */
@Slf4j
@Configuration
public class DruidDataSourceConfig {

    @Value("${spring.datasource.driver-class-name}")
    String driver;

    @Value("${spring.datasource.url}")
    String url;

    @Value("${spring.datasource.username}")
    String username;

    @Value("${spring.datasource.password}")
    String password;

    @Value("${spring.datasource.initial-size}")
    int initialSize;

    @Value("${spring.datasource.min-idle}")
    int minIdle;

    @Value("${spring.datasource.max-active}")
    int maxActive;

    @Value("${spring.datasource.max-wait}")
    long maxWait;

    @Value("${spring.datasource.time-between-eviction-runs-millis}")
    long timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.min-evictable-idle-time-millis}")
    long minEvictableIdleTimeMillis;


    @Autowired
    private StatFilter logSlowSql;

    @Bean
    @Primary   // 优先选择这个bean
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDbType(JdbcConstants.MYSQL);
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setInitialSize(initialSize);
        druidDataSource.setMinIdle(minIdle);
        druidDataSource.setMaxActive(maxActive);
        druidDataSource.setMaxWait(maxWait);
        druidDataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        druidDataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        try {
            ArrayList<Filter> arrayList = new ArrayList<>();
            arrayList.add(logSlowSql);
            druidDataSource.setProxyFilters(arrayList);
            druidDataSource.init();
        } catch (SQLException e) {
            log.error("初始化数据源出错", e.toString());
        }

        return druidDataSource;
    }

    /*@Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings("/druid/*");
        Map<String, String> initParameters = new HashMap<String, String>();
        //不设置用户名密码可以直接通过druid/index.html访问
        initParameters.put("resetEnable", "false");
        servletRegistrationBean.setInitParameters(initParameters);
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }*/

    @Bean
    public StatFilter logSlowSql() {
        StatFilter statFilter = new StatFilter();
        statFilter.setMergeSql(true);
        statFilter.setSlowSqlMillis(300);
        statFilter.setLogSlowSql(true);
        return statFilter;
    }


}
