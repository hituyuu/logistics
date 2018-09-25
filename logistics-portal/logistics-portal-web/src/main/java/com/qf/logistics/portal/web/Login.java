package com.qf.logistics.portal.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018/8/30.
 */
@Controller
//@RequestMapping("/user")
public class Login {
/*   规定请求方式必须为get
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }*/

    //    每个访问页面都配一个控制器的话,工作量太繁琐,我们可以将同级路径写成同一个
//    上述两个控制器都可以分别工作,但是可以整合成下面一个
    @RequestMapping(value = "/{target}",method = RequestMethod.GET)
    public String login(@PathVariable String target){
        System.out.println("访问的路径资源->"+target);
        return target;
    }


    @RequestMapping(value = "pages/{target}",method = RequestMethod.GET)
    public String pages(@PathVariable String target){
        System.out.println("访问的路径资源->pages/"+target);
        return "pages/"+target;
    }

    @RequestMapping(value = "pages/{target1}/{target2}",method = RequestMethod.GET)
    public String pages(@PathVariable String target1,@PathVariable String target2){
        System.out.println("访问的路径资源->pages/"+target1+"/"+target2);
        return "pages/"+target1+"/"+target2;
    }
}
