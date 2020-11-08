package com.hbg.hambergsen.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseBean implements Serializable {

    public static final long serialVersionUID = 1546045002472483990L;

    private Date createTime;

    private Date modifyTime;

    private String remark;

}
