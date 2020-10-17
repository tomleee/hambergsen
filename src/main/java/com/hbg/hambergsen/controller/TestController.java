package com.hbg.hambergsen.controller;

import com.hbg.hambergsen.bean.ResponseBean;
import com.hbg.hambergsen.bean.User;
import com.hbg.hambergsen.service.TestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Log4j2
@Api(description = "测试")
public class TestController {

    @Resource
    private TestUserService userServiceImpl;

    @GetMapping("/test/{s}")
    @ApiOperation(value = "测试", notes = "获取路径")
    public ResponseBean test(@PathVariable String s){
        log.info(String.format("测试请求参数：{}."),s);
        log.debug("hello，我是debug");
        List<User> all = userServiceImpl.getAll();
        log.info(String.format("测试请求参数：{}."),all);
        return new ResponseBean(all);
        //return new ResponseBean(ResultEnum.ERROR);
        // return new ResponseBean(ResultEnum.FAIL);
    }
}
