package com.hbg.hambergsen.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TestDto {

    @ApiModelProperty("用户主键")
    public int id;

    @ApiModelProperty("用户名")
    public String name;

}
