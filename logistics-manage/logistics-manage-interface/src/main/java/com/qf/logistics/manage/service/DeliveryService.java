package com.qf.logistics.manage.service;

import com.qf.logistics.commons.pojo.dto.PageInfo;
import com.qf.logistics.manage.pojo.po.DeliveryPO;

import java.util.List;
import java.util.Map;

/**
 * Created by yby.
 * Date 2018/9/22 13:59.
 * Description:查询delivery模块的总量和数据集合
 */
public interface DeliveryService {

    /**
     *
     * @param map 前端页面的分页信息即网点的集合封装
     * @return 查询对象结果集
     */
    List<DeliveryPO> listByNet(Map<String, Object> map);

    /**
     * @param net 当前登录用户所在网点
     * @return 返回总数
     */
    int countByNet(String net,int status);

    /**
     * 修改状态
     * @param deliveryPO
     * @return
     */
    int updateByOrderId(DeliveryPO deliveryPO);

    /**
     * 通过orderI的查找
     * @param deliveryPO
     * @return
     */
    DeliveryPO selectByOrderId(DeliveryPO deliveryPO);

    /**
     * 通过参数修改数据
     * @param deliveryPO
     * @return
     */
    int updateBySend(DeliveryPO deliveryPO);
}
