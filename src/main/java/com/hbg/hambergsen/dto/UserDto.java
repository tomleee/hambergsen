package com.hbg.hambergsen.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserDto {

    @ApiModelProperty("角色Id")
    public Integer roleId;

    @ApiModelProperty("账号")
    @NotBlank(message = "用户账号不能为空")
    @Size(min = 6, max = 20)
    public String account;

    @ApiModelProperty("登录密码")
    public String password;

    @ApiModelProperty("用户姓名")
    public String userName;

    @ApiModelProperty("手机号")
    public String mobileNo;

    @ApiModelProperty("性别")
    public String sex;

    @ApiModelProperty("年龄")
    public int age;

    @ApiModelProperty("用户状态")
    public String userStat;

    @ApiModelProperty("员工编号")
    public String employeeNo;

    @ApiModelProperty("部门")
    public String department;

    @ApiModelProperty("直属领导")
    public String supervisor;

    @ApiModelProperty("邮箱")
    public String email;

    @ApiModelProperty("创建者")
    public String creater;

    @ApiModelProperty("备注")
    public String remark;


}
