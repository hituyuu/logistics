package com.qf.logistics.search.pojo.dto;

import com.qf.logistics.search.pojo.vo.TbItemIndex;

import java.util.List;

/**
 * Created by yby on 2018/9/16.
 */
public class IndexResultDTO {
    // 查询结果总数
    private long recordCount;
    // 查询结果总页数
    private long totalPages;
    // 查询结果的集合
    private List<TbItemIndex> list;

    public long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public List<TbItemIndex> getList() {
        return list;
    }

    public void setList(List<TbItemIndex> list) {
        this.list = list;
    }
}
