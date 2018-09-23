package com.qf.logistics.manage.web;

import com.qf.logistics.commons.pojo.dto.ItemResult;
import com.qf.logistics.commons.pojo.dto.PageInfo;
import com.qf.logistics.commons.pojo.dto.ResultMessage;
import com.qf.logistics.manage.pojo.po.DeliveryPO;
import com.qf.logistics.manage.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yby.
 * Date 2018/9/22 13:16.
 * Description:收派件模块的控制器
 */
@Controller
public class DeliveryAction {

    @Autowired
    private DeliveryService service;

    @RequestMapping("/delivery/{path}")
    public String toDeliveryList(@PathVariable String path){
        System.out.println("toDeliveryList控制器访问了");
        return "pages/delivery/"+path;
    }

    @RequestMapping("/delivery/receiveList")
    @ResponseBody
    public ItemResult<DeliveryPO> receive(PageInfo pageInfo,DeliveryPO deliveryPO){
        System.out.println("receive控制器的页码信息->"+pageInfo.getLimit());

        int status = deliveryPO.getStatus();
        System.out.println("receive控制器接收的status->"+status);

        ItemResult<DeliveryPO> itemResult = new ItemResult<DeliveryPO>();
        //当前登录用户所属的站点,暂且以杭州代之
        String net = "杭州";
        // map集合用于封装查询数据
        Map<String,Object> map = new HashMap<>();
        map.put("page",pageInfo);
        map.put("net",net);
        map.put("deliveryPO",deliveryPO);
        try {
            //查询
            List<DeliveryPO> list = service.listByNet(map);
            System.out.println("++++++++++list->"+list);
            int count = service.countByNet(net,status);
            System.out.println("++++++++++count->"+count);
            itemResult.setData(list);
            itemResult.setMsg("success");
            itemResult.setCode(0);
            itemResult.setCount(count);

        } catch (Exception e) {
            e.printStackTrace();
            itemResult.setCode(1);
            itemResult.setMsg("failed");
            itemResult.setCount(0);
            itemResult.setData(null);
        }
        return itemResult;
    }


    @RequestMapping("/delivery/update")
    @ResponseBody
    public ResultMessage update(DeliveryPO deliveryPO){

        String[] orderIds = deliveryPO.getOrderIds();
        int status = deliveryPO.getStatus();
        System.out.println("接收的修改ids是->"+orderIds);
        System.out.println("接收的修改status是->"+status);

        if (status == 0) {
            deliveryPO.setStatus(1);
        } else {
            deliveryPO.setStatus(0);
        }

        ResultMessage resultMessage = new ResultMessage();

        try {
            int result = service.updateByOrderId(deliveryPO);
            resultMessage.setSuccess(true);
            resultMessage.setMessage("received:"+result);
        } catch (Exception e) {
            e.printStackTrace();
            resultMessage.setSuccess(false);
            resultMessage.setMessage("failed");
        }
        return resultMessage;
    }

    @RequestMapping("/delivery/selectByOrderId")
    public String selectByOrderId(DeliveryPO deliveryPO, Model model){

        System.out.println("selectByOrderId执行了");
        System.out.println("接收的orderId->"+deliveryPO.getOrderId());
        System.out.println("接收的status->"+deliveryPO.getStatus());
        String net = "杭州";
        deliveryPO.setNextNet(net);
        try {
            DeliveryPO deliveryPO1 = service.selectByOrderId(deliveryPO);
            model.addAttribute("deliveryPO", deliveryPO1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "pages/delivery/edit";
    }

    @RequestMapping(value = "/delivery/send", method = RequestMethod.POST)
    @ResponseBody
    public ResultMessage send(DeliveryPO deliveryPO){
        System.out.println("send()控制器执行了");
        System.out.println("接收的参数为:orderId->"+deliveryPO.getOrderId());
        System.out.println("接收的参数为:nextNet->"+deliveryPO.getNextNet());

        // 当前登录用户所属的站点,暂时以杭州代替
        String net = "杭州";
        // 一旦执行后,当前的站点就将称为数据库中的prevNet
        deliveryPO.setPrevNet(net);
        // 一旦执行送件,原本的状体1也要改为0
        deliveryPO.setStatus(0);

        ResultMessage resultMessage = new ResultMessage();
        try {
            int result = service.updateBySend(deliveryPO);
            resultMessage.setMessage("提交了"+result+"条");
            resultMessage.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            resultMessage.setMessage("提交失败");
            resultMessage.setSuccess(false);
        }
        return resultMessage;

    }

}
