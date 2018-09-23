package com.qf.logistics.manage.web;

import com.qf.logistics.commons.pojo.dto.ItemResult;
import com.qf.logistics.commons.pojo.dto.PageInfo;
import com.qf.logistics.manage.pojo.po.Info;
import com.qf.logistics.manage.pojo.po.Send;
import com.qf.logistics.manage.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by 李杰 on 2018/9/5.
 */

@Controller
public class ItemAction {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ItemService itemservice;

    @ResponseBody
    @RequestMapping(value = "/items" ,method = RequestMethod.GET)
    public ItemResult<Info> listItemsByPage(PageInfo page,Send send){
        ItemResult<Info> result=null;

    try{
    result=itemservice.listItemsByPages(page,send);
    }
    catch(Exception e){
    logger.error(e.getMessage(),e);
        e.printStackTrace();
    }
        return result;
    }

    /**
     * 处理添加的控制器
     * @param info
     * @return
     */
   @RequestMapping(value="/save/add")
    public String SaveItem(Info info){

       try{
           itemservice.AddItem(info);
       }catch(Exception e){
          logger.error(e.getMessage(),e);
           e.printStackTrace();
       }
        return "forward:/WEB-INF/jsp/pages/admin/receiveList.jsp";
    }

    /**
     * 处理修改的控制器
     * @param info
     * @return
     */
    /*@RequestMapping(value = "/modify",method = RequestMethod.PUT)
    public String ChangeItem(Info  info){
        try{
            itemservice.ModifyItem(info);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return null;
    }*/



/*
    @ResponseBody
    @RequestMapping(value = "/single" ,method = RequestMethod.GET)
    public ItemResult<Info> listItemsByGid(PageInfo page){
        ItemResult<Info> result=null;
        try{
            result=itemservice.listItemsByGid(page);
        }
        catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }*/

    /**
     * 跳转到update页面
     * 根据gid查询该条数据
     * @param send
     * @return
     */
    @RequestMapping(value = "/update/toUpdate",method = RequestMethod.GET)
    public String GetUpdate(Send send,HttpSession session){
        System.out.println(send.getGid()+"=================================");
        /*int gid=send.getGid();*/

        Info info=null;

        try{

            info=itemservice.FindByGid(send);
            System.out.println(info.getCenter1()+"=========================================");
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        session.setAttribute("info",info);
     return "forward:/WEB-INF/jsp/pages/admin/update.jsp";
    }

    /**
     * 修改页面的参数
     * @param info
     * @return
     */
    @RequestMapping(value="/update/update")
     public String UpdateItem(Info info){
        System.out.println(info.getGid()+"qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        try{
            itemservice.ModifyItem(info);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return "forward:/WEB-INF/jsp/pages/admin/receiveList.jsp";
    }

    @RequestMapping(value="/delete/update")
    public String DeleteItem(Info info){
        System.out.println(info.getGid()+"qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        info.setStatus(2);
        try{
            itemservice.ModifyItem(info);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return "forward:/WEB-INF/jsp/pages/admin/receiveList.jsp";
    }

}
