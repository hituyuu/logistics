package com.qf.logistics.portal.web;

import com.qf.logistics.portal.pojo.po.Customer;
import com.qf.logistics.portal.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by zrgtl on 2018/9/13.
 */

@Controller
public class CustomerLogin {

    @Autowired
    public CustomerService ser;

    @ResponseBody
    @RequestMapping(value = "checkuser")
    public String checkCustomer(Customer customer,HttpSession session) throws Exception{
        Customer findCustomer = ser.checkCustomer(customer);
        if(findCustomer != null){
            //鏀惧叆session
            session.setAttribute("findCustomer", findCustomer);
            System.out.print("来到这里了======================");
            return "1";
        }
        System.out.print("来到这里了");
        return "0";
    }

    @ResponseBody
    @RequestMapping(value = "checkcname")
    public String checkSname(Customer customer) throws Exception{
        System.out.println(customer.getCname()+"....................");
        Customer findCname = ser.checkCname(customer);
        if(findCname!= null){
            System.out.print("来到这里了======================");
            return "1";
        }
        System.out.print("来到这里了");
        return "0";
    }

    @ResponseBody
    @RequestMapping(value = "addcname")
    public int addCname(Customer customer) throws Exception{

        int i = 0;
        try {
            i = ser.addOneCname(customer);
        } catch (Exception e) {
            //閫氳繃logback灏嗗紓甯告墦鍗版棩蹇椾腑,ConsoleAppender FileAppender
            //       logger.error(e.getMessage(), e);
            //       e.printStackTrace();
        }
        return i;
    }


    @RequestMapping(value = "showcustomer")
    public String showCname(Customer customer,HttpSession session) throws Exception {

        Customer cus = ser.findByOneCname(customer);

        session.setAttribute("cus", cus);

        return "pages/portal/showcustomer";
    }
}
