package com.qf.logistics.manage.service.impl;

import com.qf.logistics.commons.tools.DateParse;
import com.qf.logistics.manage.dao.GoodsMapper;
import com.qf.logistics.manage.dao.GoodsViewMapper;
import com.qf.logistics.manage.pojo.dto.Page;
import com.qf.logistics.manage.pojo.dto.PageQuery;
import com.qf.logistics.manage.pojo.po.Goods;
import com.qf.logistics.manage.pojo.po.GoodsExample;
import com.qf.logistics.manage.pojo.po.Receiver;
import com.qf.logistics.manage.pojo.po.Sender;
import com.qf.logistics.manage.pojo.vo.GoodsLis;
import com.qf.logistics.manage.pojo.vo.GoodsView;
import com.qf.logistics.manage.service.GoodsViewInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 123 on 2018/9/5.
 */
@Service
@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
public class GoodsViewImp implements GoodsViewInterface {

    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsViewMapper goodsViewMapper;

    @Override
    @Transactional(readOnly = true)
    public GoodsLis<GoodsView> getGoodsView(Page page, PageQuery pageQuery) {
        GoodsLis<GoodsView> goodsLis = new GoodsLis<>();
        try {
            List<GoodsView> lis = null;
            GoodsExample goodsExample = new GoodsExample();
            GoodsExample.Criteria criteria = goodsExample.createCriteria();
            criteria.andStatusBetween(0,2);
            int count = goodsMapper.countByExample(goodsExample);
            System.out.println(count);
            Map<String, Object> map = new HashMap<>();
            map.put("page", page);
            map.put("pageQuery", pageQuery);
            lis = goodsViewMapper.listGoodsByPage(map);
            goodsLis.setMsg("成功");
            goodsLis.setCode(0);
            goodsLis.setCount(count);
            goodsLis.setData(lis);

        } catch (Exception e) {
            e.printStackTrace();
            goodsLis.setCode(1);
            goodsLis.setMsg("失败");
        }
        return goodsLis;
    }

    @Override
    public int intsertGoods(GoodsView goodsView) {

        Sender jrow = null;

        Receiver srow = null;

        int sid = 0;

        int jid = 0;

        int all = 0;
        Goods goods = new Goods();

        try {

            jrow = goodsViewMapper.selectByJname(goodsView.getJname());

            if (jrow != null) {

                jid = jrow.getId();

            }

            srow = goodsViewMapper.selectBySname(goodsView.getSname());

            if (jrow != null) {

                sid = srow.getId();

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        if (jrow == null || srow == null) {

            if (jrow == null) {

                goodsViewMapper.insertSender(goodsView);

                jid = goodsView.getId();
            }

            if (srow == null) {

                goodsViewMapper.insertReceiver(goodsView);

                sid = goodsView.getId();

            }

        }

        goods.setJdate(DateParse.stringToDate(goodsView.getDate()));

        goods.setSid(sid);

        goods.setJid(jid);

        goods.setWeight(goodsView.getWeight());

        goods.setBigenAddr(goodsView.getBigenAddr());

        goods.setEndAddr(goodsView.getEndAddr());

        goods.setGoodsName(goodsView.getGoodsName());

        goods.setGoodsPrice(goodsView.getGoodsPrice());

        goods.setStatus(goodsView.getStatus());

        all = goodsMapper.insertSelective(goods);

        return all;
    }

    @Override
    public int updateStatus(List<Integer> ids) {

        Goods goods = new Goods();

        goods.setStatus(3);

        GoodsExample goodsExample = new GoodsExample();

        GoodsExample.Criteria criteria = goodsExample.createCriteria();

        criteria.andIdIn(ids);

        return goodsMapper.updateByExampleSelective(goods,goodsExample);
    }
}
