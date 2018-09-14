package com.qf.logistics.commons.pojo.dto;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/8/30.
 */
public class PageInfo implements Serializable {
    private int page;
    private int limit;



    //设置一个方法返回当前也的起始行号,用于分页查询
    public int getOffset() {
        return (page-1)*limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}

