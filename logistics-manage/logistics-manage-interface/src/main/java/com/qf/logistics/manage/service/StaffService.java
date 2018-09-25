package com.qf.logistics.manage.service;


import com.qf.logistics.commons.pojo.dto.StaffResult;
import com.qf.logistics.commons.pojo.dto.PageInfo;
import com.qf.logistics.manage.pojo.po.TbStaff;
import com.qf.logistics.manage.pojo.po.TbStaffAdd;
import com.qf.logistics.manage.pojo.vo.TbStaffCustom;
import com.qf.logistics.manage.pojo.vo.TbStaffQuery;


import java.util.List;


public interface StaffService {

    StaffResult<TbStaffCustom> listStaffsByPage(PageInfo page, TbStaffQuery query);

    int updateStaffsByIds(List<Long> ids);

    int updateStaffByOneId(TbStaff tbStaff);

    TbStaff findStaffByOneId(TbStaff tbStaff);

    int addOneStaff(TbStaffAdd tbStaffAdd);

    int updateOneStaff(TbStaffAdd tbStaffAdd);


}
