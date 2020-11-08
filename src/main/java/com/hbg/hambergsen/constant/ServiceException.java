package com.hbg.hambergsen.constant;

import com.hbg.hambergsen.constant.eneums.ResultEnum;
import lombok.Data;

@Data
public class ServiceException extends RuntimeException {

    private Integer code;

    private String message;

    public ServiceException(ResultEnum resultEnum){
        // super(message);
        this.message = resultEnum.getMessage();
        this.code = resultEnum.getCode();
    }
}
