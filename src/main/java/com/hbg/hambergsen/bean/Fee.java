package com.hbg.hambergsen.bean;

import java.util.Date;

public class Fee {
    private Integer feeId;

    private Double feeUsd;

    private Double feeEur;

    private String finance;

    private String stat;

    private String remark;

    private Date createTime;

    public Integer getFeeId() {
        return feeId;
    }

    public void setFeeId(Integer feeId) {
        this.feeId = feeId;
    }

    public Double getFeeUsd() {
        return feeUsd;
    }

    public void setFeeUsd(Double feeUsd) {
        this.feeUsd = feeUsd;
    }

    public Double getFeeEur() {
        return feeEur;
    }

    public void setFeeEur(Double feeEur) {
        this.feeEur = feeEur;
    }

    public String getFinance() {
        return finance;
    }

    public void setFinance(String finance) {
        this.finance = finance == null ? null : finance.trim();
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat == null ? null : stat.trim();
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
}