package com.qf.logistics.manage.pojo.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 123 on 2018/9/5.
 */
public class GoodsLis<T> implements Serializable {
    private int code;
    private String msg;
    int count;
    List<T> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {

        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
