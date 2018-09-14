package com.qf.logistics.manage.service;


import com.qf.logistics.commons.pojo.dto.ItemResult;
import com.qf.logistics.commons.pojo.dto.PageInfo;
import com.qf.logistics.manage.pojo.po.Info;
import com.qf.logistics.manage.pojo.po.Send;

/**
 * Created by 李杰 on 2018/9/6.
 */
public interface ItemService {
    /**
     * 处理商品分页的
     * @param page
     * @return
     */
   ItemResult<Info> listItemsByPages(PageInfo page , Send send);

    /**
     * 处理添加的方法
     * @param info
     * @return
     */
    int AddItem(Info info);

    /**
     * 更新物流状态
     * @param info
     * @return
     */
    int ModifyItem(Info info);

    /**
     * 根据订单号查询一条记录
     * @param send
     * @return
     */
    Info FindByGid(Send send);
}
