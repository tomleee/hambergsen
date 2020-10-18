package com.hbg.hambergsen.controller;

import com.alibaba.fastjson.JSONObject;
import com.hbg.hambergsen.bean.ResponseBean;
import com.hbg.hambergsen.bean.Test;
import com.hbg.hambergsen.constant.ResultPage;
import com.hbg.hambergsen.constant.eneums.ResultEnum;
import com.hbg.hambergsen.dto.TestDto;
import com.hbg.hambergsen.service.TestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

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
        log.debug("hello，我是debug===");
        List<Test> all = userServiceImpl.getAll();
        log.info(String.format("测试请求参数：{}."),all);
        return ResponseBean.success();
    }

    @PostMapping("/test/add")
    @ApiOperation(value = "测试", notes = "添加用户")
    public ResponseBean addTest(@RequestBody TestDto userDto){
        log.info("request param is {}", JSONObject.toJSONString(userDto));
        try {
            if (StringUtils.isBlank(userDto.getName())){
                return ResponseBean.fail(ResultEnum.NUllPARAM, "用户名不能为空");
            }
            userServiceImpl.saveUser(userDto);
        }catch (Exception e){
            log.error("add user is fail {}",e.getMessage());
            return ResponseBean.fail(ResultEnum.DATABASEEXCEPTION);
        }
        return ResponseBean.success();
    }

    @GetMapping("/test/getAll")
    @ApiOperation(value = "分页查询", notes = "分页用户查询")
    public ResponseBean selectAll(@RequestParam(value = "当前页", required = false, defaultValue = "1") Integer pageNum,
                                  @RequestParam(value = "每页数量", required =  false, defaultValue = "10") int pageSize){
        ResultPage<Test> testList = userServiceImpl.getAll(pageNum, pageSize);
        log.info("query data is {}", JSONObject.toJSONString(testList));
        return ResponseBean.success(testList);

    }






}
