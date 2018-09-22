package com.qf.logistics.manage.web;

import com.qf.logistics.commons.pojo.dto.ResultMessage;
import com.qf.logistics.manage.pojo.vo.ItemIndexVO;
import com.qf.logistics.manage.service.ItemIndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by yby.
 * Date 2018/9/22 9:51.
 * Description:solr索引库导入的控制器
 */
public class IndexImportAction {
    /**
     * 代码规范, = 前后都要空一格
     * 类的成员变量的注释要用javadoc的形式
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ItemIndexService service;

    @RequestMapping(value = "/item/indexlib/import",method = RequestMethod.POST)
    @ResponseBody
    public ResultMessage importIndex(){

        System.out.println("控制器访问了");
        ResultMessage resultMessage=new ResultMessage();

        // 空行不能过多,一行就够
        try {
            List<ItemIndexVO> list = service.listAll();
            // 对于代码的注释,需要解释原因.此处为暂时不需要传输该数据
            // resultMessage.setData(list);
            resultMessage.setSuccess(true);
            resultMessage.setMessage("success");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            resultMessage.setSuccess(false);
            resultMessage.setMessage("failed");
        }

        return resultMessage;
    }
}
