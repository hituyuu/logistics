package com.qf.logistics.manage.dao;//package com.qf.logistics.manage.dao;
//
//import com.qf.logistics.manage.pojo.dto.Servers;
//import com.qf.logistics.manage.pojo.dto.ServersExample;
//import java.util.List;
//import org.apache.ibatis.annotations.Param;
//
//public interface ServersMapper {
//    int countByExample(ServersExample example);
//
//    int deleteByExample(ServersExample example);
//
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(Servers record);
//
//    int insertSelective(Servers record);
//
//    List<Servers> selectByExample(ServersExample example);
//
//    Servers selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") Servers record, @Param("example") ServersExample example);
//
//    int updateByExample(@Param("record") Servers record, @Param("example") ServersExample example);
//
//    int updateByPrimaryKeySelective(Servers record);
//
//    int updateByPrimaryKey(Servers record);
//}