package com.hbg.hambergsen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class})
@MapperScan("com.hbg.hambergsen.dao")
public class HambergsenApplication {

    public static void main(String[] args) {
        SpringApplication.run(HambergsenApplication.class, args);
    }

}
