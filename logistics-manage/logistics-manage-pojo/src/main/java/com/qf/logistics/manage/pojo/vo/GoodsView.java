package com.qf.logistics.manage.pojo.vo;

import com.qf.logistics.manage.pojo.po.Goods;

/**
 * Created by 123 on 2018/9/5.
 */
public class GoodsView extends Goods {
    private String jname;
    private String sname;
    private String phone;
    private String phone1;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
