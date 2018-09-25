package com.qf.logistics.manage.dao;



import com.qf.logistics.manage.pojo.dto.PageInfo;
import com.qf.logistics.manage.pojo.dto.Servers;
import com.qf.logistics.manage.pojo.dto.ServersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 38126 on 2018/9/4.
 */
public interface ServerMapper {
    long servercount();

    List<Servers> listserverByPage(PageInfo page);

    int insert(Servers servers)throws Exception;

    int delete(Servers servers)throws Exception;

    int update(Servers servers)throws Exception;

    Servers selectbyId(Servers servers)throws Exception;

    int updateByExampleSelective(@Param("record") Servers record, @Param("example") ServersExample example);

    List<Servers> selectbyservice(@Param("servicecompy") String servicecompy)throws Exception;

    List<Servers> select(Servers servers)throws Exception;

    List<Servers> select2(Servers servers)throws Exception;





}
