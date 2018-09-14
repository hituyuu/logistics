package com.qf.logistics.manage.dao;

import com.qf.logistics.manage.pojo.po.Info;
import com.qf.logistics.manage.pojo.po.InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoMapper {
    int countByExample(InfoExample example);

    int deleteByExample(InfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Info record);

    int insertSelective(Info record);

    List<Info> selectByExample(InfoExample example);

    Info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}