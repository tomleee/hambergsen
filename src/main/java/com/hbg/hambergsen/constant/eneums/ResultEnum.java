package com.hbg.hambergsen.constant.eneums;

import lombok.Getter;

/**
 * 后台返回结果集枚举
 * @author 小懒虫
 * @date 2018/8/14
 */
@Getter
public enum ResultEnum {

    /**
     * 通用状态
     */
    SUCCESS(200, "成功"),
    ERROR(400, "服务异常"),
    NUllPARAM(401, "入参为空"),
    DATABASEEXCEPTION(402, "数据库异常");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
