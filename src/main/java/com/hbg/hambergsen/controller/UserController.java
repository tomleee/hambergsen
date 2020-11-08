package com.hbg.hambergsen.controller;

import com.hbg.hambergsen.bean.ResponseBean;
import com.hbg.hambergsen.constant.ServiceException;
import com.hbg.hambergsen.constant.eneums.ResultEnum;
import com.hbg.hambergsen.dto.UserDto;
import com.hbg.hambergsen.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Log4j2
@Api(description = "用户模块")
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @PostMapping("/user/add")
    @ApiOperation(value = "用户", notes = "添加")
    public ResponseBean addUser(@Valid @RequestBody UserDto userDto){
        try {
            userServiceImpl.addUser(userDto);
        }catch (Exception se){
            log.error("添加用户失败：{}", se.getMessage());
            return ResponseBean.fail(ResultEnum.ERROR);
        }
        return ResponseBean.success();
    }
}
