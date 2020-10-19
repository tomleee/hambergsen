package com.hbg.hambergsen.constant;

import lombok.Data;

@Data
public class ServiceException extends RuntimeException {

    private Integer code;

    private String message;

    public ServiceException(Integer code, String message){
        // super(message);
        this.message = message;
        this.code = code;
    }
}
