package com.qf.logistics.manage.service;




import com.qf.logistics.manage.pojo.dto.PageInfo;
import com.qf.logistics.manage.pojo.dto.Servers;
import com.qf.logistics.manage.pojo.dto.ServersReult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 38126 on 2018/9/4.
 */
public interface ServersService {


    ServersReult<Servers> selectListltems(PageInfo page);

    int insertto(Servers servers)throws Exception;

    int deleteto(Servers servers)throws Exception;

    int updateto(Servers servers)throws Exception;

    Servers selectbyIdto(Servers servers)throws Exception;

    int updateItemsByIds(List<Integer> ids);

    List<Servers> selectbyserviceto(@Param("servicecompy") String servicecompy)throws Exception;

    List<Servers> selectto(Servers servers)throws Exception;
}
