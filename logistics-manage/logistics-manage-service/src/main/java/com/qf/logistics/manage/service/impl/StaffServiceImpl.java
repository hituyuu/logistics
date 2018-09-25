package com.qf.logistics.manage.service.impl;



import com.qf.logistics.commons.pojo.dto.PageInfo;
import com.qf.logistics.commons.pojo.dto.StaffResult;
import com.qf.logistics.manage.dao.TbStaffCustomMapper;
import com.qf.logistics.manage.dao.TbStaffMapper;
import com.qf.logistics.manage.pojo.po.TbStaff;
import com.qf.logistics.manage.pojo.po.TbStaffAdd;
import com.qf.logistics.manage.pojo.po.TbStaffExample;
import com.qf.logistics.manage.pojo.vo.TbStaffCustom;
import com.qf.logistics.manage.pojo.vo.TbStaffQuery;
import com.qf.logistics.manage.service.StaffService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class StaffServiceImpl implements StaffService {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TbStaffCustomMapper StaffCustom;
    @Autowired
    private TbStaffMapper staffDao;

    @Override
    public StaffResult<TbStaffCustom> listStaffsByPage(PageInfo page, TbStaffQuery query) {
        StaffResult<TbStaffCustom> result= new StaffResult<TbStaffCustom>();
        result.setCode(0);
        result.setMsg("success");
        try {

            Map<String,Object> map = new HashMap<String,Object>();
            map.put("page",page);
            map.put("query",query);

           long count = StaffCustom.countStaffs(map);

            List<TbStaffCustom> list = StaffCustom.listStaffsByPage(map);
         result.setCount(count);
            result.setData(list);
        } catch (Exception e) {
            result.setCode(1);
            result.setMsg("failed");
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateStaffsByIds(List<Long> ids) {
        int i=0;
        try {

            TbStaff record = new TbStaff();
            record.setDuties((byte)4);

            TbStaffExample example = new TbStaffExample();
            TbStaffExample.Criteria criteria = example.createCriteria();

            criteria.andIdIn(ids);

            i = staffDao.updateByExampleSelective(record, example);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int updateStaffByOneId(TbStaff tbStaff) {
        int i = 0;

        try {
            i = StaffCustom.updateSelectByOneId(tbStaff);
        } catch (Exception e) {
   //         logger.error(e.getMessage(), e);
  //          e.printStackTrace();
        }
        return i;

    }

    public TbStaff findStaffByOneId(TbStaff tbStaff) {

        return StaffCustom.findSelectByOneId(tbStaff);

    }

    @Override
    public int addOneStaff(TbStaffAdd tbStaffAdd) {

        return  StaffCustom.saveOneStaff(tbStaffAdd);
    }

    @Override
    public int updateOneStaff(TbStaffAdd tbStaffAdd) {

        return  StaffCustom.updateOneStaff(tbStaffAdd);
    }
}
