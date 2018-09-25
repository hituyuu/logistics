package com.qf.logistics.portal.service.impl;


import org.springframework.stereotype.Service;
import com.qf.logistics.portal.dao.CustomerMapper;
import com.qf.logistics.portal.pojo.po.Customer;
import com.qf.logistics.portal.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    protected CustomerMapper mapper;

    @Override
    public Customer checkCustomer(Customer customer) {
        Customer findCustomer = this.findByName(customer);
        if(findCustomer != null){
            if(findCustomer .getPassword().equals(customer.getPassword())){
                return findCustomer ;
            }
        }
        return null;
    }


    @Override
    public Customer findByName(Customer customer) {

        return mapper.selectByName(customer);
    }

    @Override
    public Customer checkCname(Customer customer) {

        Customer findCname = this.findByCame(customer);
        if(findCname != null){
                return findCname ;
        }
        return null;
    }

    @Override
    public int addOneCname(Customer customer) {
        return mapper.saveOneCname(customer);
    }

    @Override
    public Customer findByOneCname(Customer customer) {
        return mapper.selectByCame(customer);
    }


    private Customer findByCame(Customer customer) {
        return mapper.selectByCame(customer);
    }
}
