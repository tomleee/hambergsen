package com.hbg.hambergsen.bean;

import java.util.Date;

public class Declare {
    private Integer declareId;

    private String declareType;

    private String stat;

    private String declareTopic;

    private String maintainer;

    private String remark;

    private Date createTime;

    private Date publishTime;

    private String declareDesc;

    public Integer getDeclareId() {
        return declareId;
    }

    public void setDeclareId(Integer declareId) {
        this.declareId = declareId;
    }

    public String getDeclareType() {
        return declareType;
    }

    public void setDeclareType(String declareType) {
        this.declareType = declareType == null ? null : declareType.trim();
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat == null ? null : stat.trim();
    }

    public String getDeclareTopic() {
        return declareTopic;
    }

    public void setDeclareTopic(String declareTopic) {
        this.declareTopic = declareTopic == null ? null : declareTopic.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getDeclareDesc() {
        return declareDesc;
    }

    public void setDeclareDesc(String declareDesc) {
        this.declareDesc = declareDesc == null ? null : declareDesc.trim();
    }
}