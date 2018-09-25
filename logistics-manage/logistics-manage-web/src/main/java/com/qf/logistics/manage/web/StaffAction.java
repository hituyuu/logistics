package com.qf.logistics.manage.web;

import com.qf.logistics.commons.pojo.dto.PageInfo;
import com.qf.logistics.commons.pojo.dto.StaffResult;
import com.qf.logistics.manage.pojo.po.TbStaff;
import com.qf.logistics.manage.pojo.po.TbStaffAdd;
import com.qf.logistics.manage.pojo.vo.TbStaffCustom;
import com.qf.logistics.manage.pojo.vo.TbStaffQuery;
import com.qf.logistics.manage.service.impl.StaffServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class StaffAction {

    //初始化logger
  //  private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @Autowired
    public StaffServiceImpl ser;




    @ResponseBody
    @RequestMapping(value="/staff",method = RequestMethod.GET)
    public StaffResult<TbStaffCustom> listStaffsByPage(PageInfo page, TbStaffQuery query,HttpSession session) {
      System.out.println(query.getSname()+"+++++++++++++++++++++++++++++++++++++++++++");
        StaffResult<TbStaffCustom> result = null;
        try {
            result = ser.listStaffsByPage(page,query);
            if(result!=null){
           session.setAttribute("sessionstaff", result);}
        } catch (Exception e) {
            //通过logback将异常打印日志中,ConsoleAppender FileAppender
   //         logger.error(e.getMessage(), e);
        //    e.printStackTrace();

        }
        return result;

    }

    @ResponseBody
    @RequestMapping(value = "/staff/batch",method = RequestMethod.POST)
    public Object updateItemsByIds(@RequestParam("ids[]") List<Long> ids){
        int i = 0;
        try {
            i = ser.updateStaffsByIds(ids);
        } catch (Exception e) {
            //通过logback将异常打印日志中,ConsoleAppender FileAppender
     //       logger.error(e.getMessage(), e);
     //       e.printStackTrace();
        }
        return i;
    }


    @ResponseBody
    @RequestMapping(value = "/staff/delete",method = RequestMethod.POST)
    public int updateStaffByOneId(TbStaff tbStaff){

        System.out.println(tbStaff.getId());
        int i = 0;
        try {
            i = ser.updateStaffByOneId(tbStaff);
        } catch (Exception e) {
            //通过logback将异常打印日志中,ConsoleAppender FileAppender
            //       logger.error(e.getMessage(), e);
            //       e.printStackTrace();
        }
        return i;
    }


    @RequestMapping(value = "/staff/update")
    public String findStaffByOneId(TbStaff tbStaff,Model model){

        TbStaff staff = ser.findStaffByOneId(tbStaff);

        model.addAttribute("staff",staff);

        return "pages/member/edit";
    }


    @ResponseBody
    @RequestMapping(value = "/staff/add")
    public int addOneStaff(TbStaffAdd tbStaffAdd){
System.out.println(tbStaffAdd.getDepartment()+tbStaffAdd.getSname()+"======================");
        int i = 0;
        try {
            i = ser.addOneStaff(tbStaffAdd);
        } catch (Exception e) {
            //通过logback将异常打印日志中,ConsoleAppender FileAppender
            //       logger.error(e.getMessage(), e);
            //       e.printStackTrace();
        }
        return i;
    }

    @ResponseBody
    @RequestMapping(value = "/staff/edit")
    public int updateOneStaff(TbStaffAdd tbStaffAdd){
        System.out.println(tbStaffAdd.getDepartment()+tbStaffAdd.getSname()+"======================");
        int i = 0;
        try {
            i = ser.updateOneStaff(tbStaffAdd);
        } catch (Exception e) {
            //通过logback将异常打印日志中,ConsoleAppender FileAppender
            //       logger.error(e.getMessage(), e);
            //       e.printStackTrace();
        }
        return i;
    }


}
