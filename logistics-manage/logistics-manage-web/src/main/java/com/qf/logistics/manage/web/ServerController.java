package com.qf.logistics.manage.web;



import com.qf.logistics.manage.pojo.dto.PageInfo;
import com.qf.logistics.manage.pojo.dto.Servers;
import com.qf.logistics.manage.pojo.dto.ServersReult;
import com.qf.logistics.manage.service.ServersService;

import com.sun.tools.internal.ws.processor.model.Model;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * Created by 38126 on 2018/8/28.
 */
//ע��
@Controller
public class ServerController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ServersService serversService;

    @ResponseBody
    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public ServersReult<Servers> selectListuser(PageInfo page) {

        ServersReult<Servers> litem = null;

        try {
            litem = serversService.selectListltems(page);
        } catch (Exception e) {

            logger.error(e.getMessage(), e);

            e.printStackTrace();

        }

        return litem;
    }
    @RequestMapping(value = "/selectservice",method = RequestMethod.GET)
    public String toservice(){


        return "service.do";
    }
    @RequestMapping(value = "/select.do",method = RequestMethod.GET)
    public String toselect(Servers servers)throws Exception{

        List<Servers> list = serversService.selectto(servers);



        return "index";
    }


    @RequestMapping(value = "/toinsert", method = RequestMethod.GET)

    public String toindex() {


        return "add";
    }

    //��
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String toinsert(Servers servers) throws Exception {

        int i = serversService.insertto(servers);
        System.out.println(servers);
        if (i > 0) {

            return "redirect:/pages/item/add";

        }

        return "text1";
    }

    //ɾ
    @RequestMapping(value = "/item/delete", method = RequestMethod.GET)
    public String todelete(Servers servers,HttpSession session) {


        System.out.print(servers.getId());
        int i = 0;

        try {

           i =  serversService.deleteto(servers);

            System.out.print(servers.getId());

           session.setAttribute("servers",servers);

            if(i>0){

                return "redirect:/items";
            }

        } catch (Exception e) {

            logger.error(e.getMessage(), e);
             e.printStackTrace();
        }

        return "404";
    }
     //��

    //��id
    @RequestMapping(value = "/selectby",method = RequestMethod.GET)
    public String toselect(Model model,Servers server)throws Exception{

        Servers servers = serversService.selectbyIdto(server);
        System.out.print(servers);



        return "update";
    }
    //��
    @RequestMapping(value = "/item/update",method = RequestMethod.POST)
    public String toupdate(Servers servers)throws Exception{
        int i = serversService.updateto(servers);

        if (i>0){

            return "index";

        }else {

            return "404";
        }


    }
    //����ɾ��
    @ResponseBody
    @RequestMapping(value = "/item/batch",method = RequestMethod.POST)
    public Object updateItemsByIds(@RequestParam("ids[]") List<Integer> ids){
        int i = 0;
        try {
            i = serversService.updateItemsByIds(ids);
        } catch (Exception e) {
            //ͨ��logback���쳣��ӡ��־��,ConsoleAppender FileAppender
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @RequestMapping(value = "/service.do",method = RequestMethod.GET)
    public String servicedo(@Param("servicecompy")String servicecompy,Model model)throws Exception{

       List<Servers> serverses = serversService.selectbyserviceto(servicecompy);



               System.out.println(serverses);

                return "pages/item/list";

    }






}
