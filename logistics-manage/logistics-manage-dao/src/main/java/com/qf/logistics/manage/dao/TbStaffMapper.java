package com.qf.logistics.manage.dao;


import com.qf.logistics.manage.pojo.po.TbStaff;
import com.qf.logistics.manage.pojo.po.TbStaffExample;
import org.apache.ibatis.annotations.Param;


/**
 * Created by zrgtl on 2018/9/5.
 */
public interface TbStaffMapper {


    int updateByExampleSelective(@Param("record") TbStaff record, @Param("example") TbStaffExample example);


}