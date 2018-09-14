package com.qf.logistics.manage.service.impl;

import com.qf.logistics.commons.pojo.dto.ItemResult;
import com.qf.logistics.commons.pojo.dto.PageInfo;
import com.qf.logistics.manage.dao.ItemCustomerMapper;
import com.qf.logistics.manage.pojo.po.Info;
import com.qf.logistics.manage.pojo.po.Send;
import com.qf.logistics.manage.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 李杰 on 2018/9/6.
 */
@Service
public class ItemServiceImpl implements ItemService {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ItemCustomerMapper itemCustomerDao;

    /**
     * 处理站展示列表和分页的方法
     * @param page
     * @param send
     * @return
     */
   @Override
   public ItemResult<Info> listItemsByPages(PageInfo page ,Send send) {
        ItemResult<Info> result =new ItemResult<>();
        result.setCode(0);
        result.setMsg("success");
        try{
            long count=itemCustomerDao.CountItems(send);
            List<Info> list=itemCustomerDao.listItemByPage(page,send);
            result.setCount(count);
            result.setData(list);

        }catch(Exception e){
            result.setCode(1);
            result.setMsg("failed");
            logger.error(e.getMessage(),e);
            e.printStackTrace();

        }
        return result;
    }

    /**
     * 处理添加的方法
     * @param info
     * @return
     */
    @Override
    public int AddItem(Info info) {
        int i=0;
        try{
          i = itemCustomerDao.InsertItem(info);
        }catch(Exception e){
           logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;

    }


    @Override
    /**
     * 修改物流状态的方法
     */
    public int ModifyItem(Info info) {
        int i=0;
        try{
            i = itemCustomerDao.UpdateItem(info);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 根据订单号查询一条数据
     * @param send
     * @return
     */
    @Override
    public Info FindByGid(Send send) {
        Info info=null;
        try{
            info=itemCustomerDao.SelectByGid(send);
        }catch(Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return info;
    }


}
