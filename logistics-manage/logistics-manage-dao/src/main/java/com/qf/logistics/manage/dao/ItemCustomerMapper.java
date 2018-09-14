package com.qf.logistics.manage.dao;

import com.qf.logistics.commons.pojo.dto.PageInfo;
import com.qf.logistics.manage.pojo.po.Info;
import com.qf.logistics.manage.pojo.po.Send;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 李杰 on 2018/9/6.
 */
public interface ItemCustomerMapper {
    //查询所有数据
    long CountItems(@Param("send")Send send);
    //分页数据显示
    List<Info> listItemByPage(@Param("page") PageInfo page,@Param("send") Send send);
    //添加数据
    int InsertItem(Info  info);
    //更新物流信息
    int UpdateItem(Info info);
    //根据gid查询一条记录
    Info SelectByGid(@Param("send") Send send);
}
