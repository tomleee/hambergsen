package com.hbg.hambergsen.bean;

import com.hbg.hambergsen.constant.eneums.ResultEnum;
import lombok.*;

/**
 * 返回类
 */
@Data
@Builder
@ToString
@AllArgsConstructor
public class ResponseBean<T> {

    protected Integer code = 200;

    protected String msg = "success";

    protected T data;

    public ResponseBean() {
    }

    public ResponseBean(T data) {
        this.data = data;
    }

    public ResponseBean(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
    }

}

