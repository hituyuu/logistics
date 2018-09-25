package com.qf.logistics.portal.dao;

import com.qf.logistics.portal.pojo.po.Customer;

/**
 * Created by zrgtl on 2018/9/12.
 */
public interface CustomerMapper {
    Customer selectByName(Customer customer);

    Customer selectByCame(Customer customer);

    int saveOneCname(Customer customer);
}
