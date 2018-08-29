package action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用于处理登录
 * Created by Administrator on 2018/8/29.
 */
@Controller
@RequestMapping("/user")
public class LoginAction {

    @RequestMapping("/login")
    public String login(){
        System.out.println("login被访问了");
        return "login";
    }
}
