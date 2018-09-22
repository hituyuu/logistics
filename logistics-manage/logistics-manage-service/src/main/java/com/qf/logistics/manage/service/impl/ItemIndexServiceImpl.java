package com.qf.logistics.manage.service.impl;

import com.qf.logistics.manage.dao.ItemIndexMapper;
import com.qf.logistics.manage.pojo.vo.ItemIndexVO;
import com.qf.logistics.manage.service.ItemIndexService;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by yby.
 * Date 2018/9/15 19:56.
 * Description:
 */
@Service
public class ItemIndexServiceImpl implements ItemIndexService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ItemIndexMapper mapper;

    /**
     * 类的成员方法和成员变量使用javadoc的注释
     * 需配置solr.xml才能注入.实际为多态,父类引用指向HttpSolrServer的实例
     */
    @Autowired
    private SolrServer solrServer;

    @Override
    public List<ItemIndexVO> listAll() {
        // 单行注释后有且仅有一个空格
        // 单行注释只能用在方法内
        // 不能直接用1024数字作为参数,因为不能出现魔法值
        int initialCapacity = 1024;
        List<ItemIndexVO> list = new ArrayList<ItemIndexVO>(initialCapacity);
        System.out.println("service层访问了");

        try {
            System.out.println("service的try执行了");
            // 1.从mysql中采集数据得到list集合
            list = mapper.listAllIndex();

            System.out.println("list"+list);
            // 2.遍历list集合,并转为documentList集合
            for (ItemIndexVO itemIndex:list) {

                System.out.println("for循环执行了");
                // 每一次遍历都是一个新的document.需写在循环内部
                // 得到solr库中的文本域对象
                SolrInputDocument document = new SolrInputDocument();

                // 添加字段到文本域中,其中字段须与schema.xml配置文件对应
                document.addField("id",itemIndex.getId());
                System.out.println("id->"+itemIndex.getId());
                document.addField("item_title",itemIndex.getTitle());
                document.addField("item_sell_point",itemIndex.getSellPoint());
                document.addField("item_price",itemIndex.getPrice());
                document.addField("item_image",itemIndex.getImage());
                document.addField("item_category_name",itemIndex.getCatName());

                // 3.将document文档对象封装到solr中
                solrServer.add(document);
            }
            // 4提交到solr库中
            solrServer.commit();

        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }

        return list;
    }
}
