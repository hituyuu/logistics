package com.qf.logistics.manage.service.impl;



import com.qf.logistics.manage.dao.ServerMapper;

import com.qf.logistics.manage.pojo.dto.PageInfo;
import com.qf.logistics.manage.pojo.dto.Servers;
import com.qf.logistics.manage.pojo.dto.ServersExample;
import com.qf.logistics.manage.pojo.dto.ServersReult;
import com.qf.logistics.manage.service.ServersService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 38126 on 2018/8/30.
 */
@Service
@Transactional(isolation= Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED)
public class ServerServicelmpl implements ServersService {

    //初始化logger
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
       private ServerMapper serverMapper;


    @Override
    public ServersReult<Servers> selectListltems(PageInfo page){
        ServersReult<Servers> users = new ServersReult<>();
        //当code等于0的术后代表查询正确 反之则查询错误
           users.setCode(0);
           users.setMsg("success");

        try {
            //查询用户的总数量
            long count = serverMapper.servercount();
            //调用dao层接口
            List<Servers> reult = serverMapper.listserverByPage(page);
            //在把商品的总数量拿进去
            users.setCount(count);
            users.setData(reult);
        }catch (Exception e){
            //反之
            users.setCode(1);
            users.setMsg("dilist");
          logger.error(e.getMessage(),e);
              e.printStackTrace();
        }



        return users;
    }

    @Override
    public int insertto(Servers servers) throws Exception {


       return serverMapper.insert(servers);



    }

    @Override
    public int deleteto(Servers servers) throws Exception {

        int g =  serverMapper.delete(servers);

        return g;
    }

    @Override
    public int updateto(Servers servers) throws Exception {

       int i =  serverMapper.update(servers);

        return i;
    }
   @Transactional(readOnly = true)
    @Override
    public Servers selectbyIdto(Servers servers) throws Exception {

        Servers servers1 = serverMapper.selectbyId(servers);


        return servers1;
    }

    @Override
    public int updateItemsByIds(List<Integer> ids) {
        int i = 0;
        try {
            //封装一个商品对象，携带了删除状态
            Servers record = new Servers();
            //使用example
            //创建模板
            ServersExample example = new ServersExample();
            ServersExample.Criteria criteria = example.createCriteria();
            //设值
            criteria.andIdIn(ids);
            //真正执行修改操作
            i = serverMapper.updateByExampleSelective(record, example);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Servers> selectbyserviceto(@Param("servicecompy") String servicecompy) throws Exception {
        List<Servers> serverses = serverMapper.selectbyservice(servicecompy);



         return serverses;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Servers> selectto(Servers servers) throws Exception {

        List<Servers> list = serverMapper.select(servers);


        return list;
    }


}
