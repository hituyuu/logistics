package com.qf.logistics.manage.pojo.po;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created by yby.
 * Date 2018/9/22 13:43.
 * Description:
 */

public class DeliveryPO {
    private String orderId;
    private String beginAddr;
    private String beginTime;
    private String endAddr;
    private String prevNet;
    private String prevSendTime;
    private int status;
    private String[] orderIds;

    public String[] getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(String[] orderIds) {
        this.orderIds = orderIds;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBeginAddr() {
        return beginAddr;
    }

    public void setBeginAddr(String beginAddr) {
        this.beginAddr = beginAddr;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndAddr() {
        return endAddr;
    }

    public void setEndAddr(String endAddr) {
        this.endAddr = endAddr;
    }

    public String getPrevNet() {
        return prevNet;
    }

    public void setPrevNet(String prevNet) {
        this.prevNet = prevNet;
    }

    public String getPrevSendTime() {
        return prevSendTime;
    }

    public void setPrevSendTime(String prevSendTime) {
        this.prevSendTime = prevSendTime;
    }
}
