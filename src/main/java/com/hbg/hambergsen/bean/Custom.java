package com.hbg.hambergsen.bean;

import java.util.Date;

public class Custom {
    private Integer customId;

    private String customType;

    private String customName;

    private String customAddr;

    private String taxpayerNo;

    private String taxpayerType;

    private String bankNet;

    private String acctNoCny;

    private String acctNoUsd;

    private String acctNoEur;

    private String mobileNo;

    private String contactName;

    private String email;

    private String state;

    private String salesman;

    private String remark;

    private Date createTime;

    private Date modifyTime;

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public String getCustomType() {
        return customType;
    }

    public void setCustomType(String customType) {
        this.customType = customType == null ? null : customType.trim();
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName == null ? null : customName.trim();
    }

    public String getCustomAddr() {
        return customAddr;
    }

    public void setCustomAddr(String customAddr) {
        this.customAddr = customAddr == null ? null : customAddr.trim();
    }

    public String getTaxpayerNo() {
        return taxpayerNo;
    }

    public void setTaxpayerNo(String taxpayerNo) {
        this.taxpayerNo = taxpayerNo == null ? null : taxpayerNo.trim();
    }

    public String getTaxpayerType() {
        return taxpayerType;
    }

    public void setTaxpayerType(String taxpayerType) {
        this.taxpayerType = taxpayerType == null ? null : taxpayerType.trim();
    }

    public String getBankNet() {
        return bankNet;
    }

    public void setBankNet(String bankNet) {
        this.bankNet = bankNet == null ? null : bankNet.trim();
    }

    public String getAcctNoCny() {
        return acctNoCny;
    }

    public void setAcctNoCny(String acctNoCny) {
        this.acctNoCny = acctNoCny == null ? null : acctNoCny.trim();
    }

    public String getAcctNoUsd() {
        return acctNoUsd;
    }

    public void setAcctNoUsd(String acctNoUsd) {
        this.acctNoUsd = acctNoUsd == null ? null : acctNoUsd.trim();
    }

    public String getAcctNoEur() {
        return acctNoEur;
    }

    public void setAcctNoEur(String acctNoEur) {
        this.acctNoEur = acctNoEur == null ? null : acctNoEur.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman == null ? null : salesman.trim();
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

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}