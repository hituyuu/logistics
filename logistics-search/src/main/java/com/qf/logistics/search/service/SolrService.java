package com.qf.logistics.search.service;

import com.qf.logistics.commons.pojo.dto.PageInfo;
import com.qf.logistics.search.pojo.dto.IndexResultDTO;

/**
 * 用于调用dao层查询solr索引库
 * Created by yby on 2018/9/16.
 */
public interface SolrService {

    /**
     *
     * @param keyword 前台的查询关键字
     * @param pageInfo 分页信息
     * @return
     */
    IndexResultDTO listAll(String keyword, PageInfo pageInfo);
}
