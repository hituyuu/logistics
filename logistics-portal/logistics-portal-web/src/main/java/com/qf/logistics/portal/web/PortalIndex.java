package com.qf.logistics.portal.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/9/12.
 */
@Controller
public class PortalIndex {

    @RequestMapping("/index")
    public String portalIndex(){
        return "index";
    }

    @RequestMapping("/net")
    public String net(){

        return "net/net";
    }

}

