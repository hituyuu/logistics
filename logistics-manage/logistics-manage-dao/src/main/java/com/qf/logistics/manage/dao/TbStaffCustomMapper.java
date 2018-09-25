package com.qf.logistics.manage.dao;

import com.qf.logistics.manage.pojo.po.TbStaff;
import com.qf.logistics.manage.pojo.po.TbStaffAdd;
import com.qf.logistics.manage.pojo.vo.TbStaffCustom;

import java.util.List;
import java.util.Map;

/**
 * Created by zrgtl on 2018/9/5.
 */
public interface TbStaffCustomMapper {
    long countStaffs(Map<String, Object> map);

    List<TbStaffCustom> listStaffsByPage(Map<String, Object> map);

    int updateSelectByOneId(TbStaff tbStaff);

    TbStaff findSelectByOneId(TbStaff tbStaff);

    int saveOneStaff(TbStaffAdd tbStaffAdd);

    int updateOneStaff(TbStaffAdd tbStaffAdd);
}
