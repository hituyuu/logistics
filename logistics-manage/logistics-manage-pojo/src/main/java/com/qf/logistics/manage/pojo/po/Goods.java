package com.qf.logistics.manage.pojo.po;

import java.util.Date;

public class Goods {
    private Integer id;

    private String goodsName;

    private String goodsType;

    private Integer jid;

    private Integer sid;

    private Double goodsPrice;

    private Date jdate;

    private Double weight;

    private String bigenAddr;

    private String endAddr;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Date getJdate() {
        return jdate;
    }

    public void setJdate(Date jdate) {
        this.jdate = jdate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBigenAddr() {
        return bigenAddr;
    }

    public void setBigenAddr(String bigenAddr) {
        this.bigenAddr = bigenAddr == null ? null : bigenAddr.trim();
    }

    public String getEndAddr() {
        return endAddr;
    }

    public void setEndAddr(String endAddr) {
        this.endAddr = endAddr == null ? null : endAddr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}