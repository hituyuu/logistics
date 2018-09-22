package com.qf.logistics.manage.service;

import com.qf.logistics.manage.pojo.vo.ItemIndexVO;

import java.util.List;

/**
 * Created by yby.
 * Date 2018/9/22 9:57.
 * Description:
 */
public interface ItemIndexService {

    /**
     * dao和service层获取多个对象时使用list命名方法
     * 用于查询tb_item中所有的数据,以便建立solr全文检索
     * @return ItemIndex的vo对象
     */
    List<ItemIndexVO> listAll();
}
