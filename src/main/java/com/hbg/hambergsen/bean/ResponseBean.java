package com.hbg.hambergsen.bean;

import com.hbg.hambergsen.constant.eneums.ResultEnum;
import lombok.*;

import java.io.Serializable;

/**
 * 返回类
 */
@Data
@NoArgsConstructor
public class ResponseBean implements Serializable {

    protected Integer code;

    protected String msg;

    protected Object data;

    public static ResponseBean success(){
        ResponseBean result = new ResponseBean();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMessage());
        return result;

    }

    public static ResponseBean success(Object data){
        ResponseBean result = new ResponseBean();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMessage());
        result.setData(data);
        return result;

    }

    public static ResponseBean fail(ResultEnum resultEnum){
        ResponseBean result = new ResponseBean();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMessage());
        return result;

    }

    public static ResponseBean fail(ResultEnum resultEnum, Object data){
        ResponseBean result = new ResponseBean();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMessage());
        result.setData(data);
        return result;

    }

    public static ResponseBean exception(Integer code, String msg){
        ResponseBean result = new ResponseBean();
        result.setCode(code);
        result.setMsg(msg);
        return result;

    }


}

