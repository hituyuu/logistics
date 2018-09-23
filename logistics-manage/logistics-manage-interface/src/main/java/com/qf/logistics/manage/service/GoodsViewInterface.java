package com.qf.logistics.manage.service;

import com.qf.logistics.manage.pojo.dto.Page;
import com.qf.logistics.manage.pojo.dto.PageQuery;
import com.qf.logistics.manage.pojo.vo.GoodsLis;
import com.qf.logistics.manage.pojo.vo.GoodsView;

import java.util.List;

/**
 * Created by 123 on 2018/9/5.
 */
public interface GoodsViewInterface {
    GoodsLis<GoodsView> getGoodsView(Page page, PageQuery pageQuery);
    int intsertGoods(GoodsView goodsView);
    int updateStatus(List<Integer> ids);

}
