package com.qf.logistics.manage.pojo.dto;

/**
 * 用于分页查询的参数封装成pojo.但由于其他的模块也很有可能
 * 用到分页查询,所以该类写在dao模块并不十分合理.
 * 建议写在commons模块,以便增加通用性
 * Created by Administrator on 2018/8/30.
 */
public class Page {
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
