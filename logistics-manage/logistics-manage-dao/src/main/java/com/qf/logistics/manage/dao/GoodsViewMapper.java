package com.qf.logistics.manage.dao;

import com.qf.logistics.manage.pojo.po.Receiver;
import com.qf.logistics.manage.pojo.po.Sender;
import com.qf.logistics.manage.pojo.vo.GoodsView;

import java.util.List;
import java.util.Map;

/**
 * Created by 123 on 2018/9/5.
 */
public interface GoodsViewMapper {
    List<GoodsView> listGoodsByPage(Map map);
    int insert(GoodsView goodsView);
    Sender selectByJname(String jname);
    Receiver selectBySname(String sname);
    int insertSender(GoodsView goodsView);
    int insertReceiver(GoodsView goodsView);

}
