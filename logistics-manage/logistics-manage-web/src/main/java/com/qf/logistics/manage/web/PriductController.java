package com.qf.logistics.manage.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by 38126 on 2018/9/12.
 */
@Controller
public class PriductController {


    @RequestMapping(value = "/product/selectproduct.do", method = RequestMethod.GET)
    public String selectProduct(){


        return "selectproduct.do";
    }

}
