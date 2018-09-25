package com.qf.logistics.portal.service;

import com.qf.logistics.portal.pojo.po.Customer;

/**
 * Created by zrgtl on 2018/9/12.
 */
public interface CustomerService {

    Customer checkCustomer(Customer customer);

    Customer findByName(Customer customer);

    Customer checkCname(Customer customer);

    int addOneCname(Customer customer);

    Customer findByOneCname(Customer customer);
}
