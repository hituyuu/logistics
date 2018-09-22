package com.qf.logistics.manage.dao;

import com.qf.logistics.commons.pojo.dto.PageInfo;
import com.qf.logistics.manage.pojo.po.DeliveryPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by yby.
 * Date 2018/9/22 14:05.
 * Description:delivery模块的查询
 */
public interface DeliveryMapper {
    /**
     * 分页信息查询集合
     * @param map Map<String, Object>
     * @return 结果集合
     */
    List<DeliveryPO> listByNet(Map<String, Object> map);

    /**
     * 通过网店查询总数量
     * @param net 网店
     * @return 总量
     */
    int countByNet(@Param("net") String net, @Param("status") int status);

    /**
     * 修改状态
     * @param deliveryPO
     * @return
     */
    int updateByOrderId(DeliveryPO deliveryPO);
}
