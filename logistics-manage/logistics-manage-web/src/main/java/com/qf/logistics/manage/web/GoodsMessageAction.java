package com.qf.logistics.manage.web;

import com.qf.logistics.manage.pojo.dto.Page;
import com.qf.logistics.manage.pojo.dto.PageQuery;
import com.qf.logistics.manage.pojo.vo.GoodsLis;
import com.qf.logistics.manage.pojo.vo.GoodsView;
import com.qf.logistics.manage.service.FileUAD;
import com.qf.logistics.manage.service.GoodsViewInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by 123 on 2018/9/5.
 */
@Controller
public class GoodsMessageAction {
    @Autowired
    private GoodsViewInterface goodsViewServer;
    @Autowired
    private FileUAD fileUAD;
    @ResponseBody
    @RequestMapping(value = "/goodsmess", method = RequestMethod.GET)
    public GoodsLis<GoodsView> goodsViewGoodsLis(Page page, PageQuery pageQuery) {

        return goodsViewServer.getGoodsView(page, pageQuery);
    }

    @ResponseBody
    @RequestMapping(value = "/adsd/goods",method = RequestMethod.POST)
    public Object goodsAdd(GoodsView goodsView) {

        return  goodsViewServer.intsertGoods(goodsView);
    }
    @ResponseBody
    @RequestMapping(value = "/updatestatus",method = RequestMethod.POST)
    public Object updateStatus(@RequestParam("ids[]")List<Integer> ids){

        return goodsViewServer.updateStatus(ids);
    }
    @ResponseBody
    @RequestMapping(value = "/uploadimg",method = RequestMethod.POST)
    public String upLoadImg(@RequestParam MultipartFile file){
        System.out.println(file.getOriginalFilename());
        return fileUAD.upLoadImg(file);
    }

}
