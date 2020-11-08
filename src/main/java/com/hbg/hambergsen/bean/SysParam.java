package com.hbg.hambergsen.bean;

import java.util.Date;

public class SysParam {
    private Byte id;

    private String paramId;

    private String paramValue;

    private String paramCnyDesc;

    private String maintainer;

    private String remark;

    private Date maintainTime;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId == null ? null : paramId.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public String getParamCnyDesc() {
        return paramCnyDesc;
    }

    public void setParamCnyDesc(String paramCnyDesc) {
        this.paramCnyDesc = paramCnyDesc == null ? null : paramCnyDesc.trim();
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer == null ? null : maintainer.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getMaintainTime() {
        return maintainTime;
    }

    public void setMaintainTime(Date maintainTime) {
        this.maintainTime = maintainTime;
    }
}