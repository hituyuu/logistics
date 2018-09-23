package com.qf.logistics.manage.service.impl;

import com.qf.logistics.manage.dao.DeliveryMapper;
import com.qf.logistics.manage.pojo.po.DeliveryPO;
import com.qf.logistics.manage.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by yby.
 * Date 2018/9/22 14:02.
 * Description:
 */
@Service
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    private DeliveryMapper mapper;

    @Override
    public List<DeliveryPO> listByNet(Map<String,Object> map) {
        System.out.println("service层查询执行了");
        return mapper.listByNet(map);
    }

    @Override
    public int countByNet(String net, int status) {
        System.out.println("service层查询执行了");
        return mapper.countByNet(net, status);

    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
    public int updateByOrderId(DeliveryPO deliveryPO) {
        System.out.println("service层update执行了");
        return mapper.updateByOrderId(deliveryPO);
    }

    @Override
    public DeliveryPO selectByOrderId(DeliveryPO deliveryPO) {
        System.out.println("service层update执行了");
        return mapper.getByOrderId(deliveryPO);
    }

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
    public int updateBySend(DeliveryPO deliveryPO) {
        System.out.println("service层update执行了");
        return mapper.updateBySend(deliveryPO);
    }
}
