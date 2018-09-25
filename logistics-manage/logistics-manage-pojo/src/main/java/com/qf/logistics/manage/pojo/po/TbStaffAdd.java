package com.qf.logistics.manage.pojo.po;

/**
 * Created by zrgtl on 2018/9/4.
 */
public class TbStaffAdd {

    private Integer id;
    private String sname;
    private String password;
    private String idcard;
    private String phone;
    private Integer jobnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(Integer jobnumber) {
        this.jobnumber = jobnumber;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    public void setDuties(byte duties) {
        this.duties = duties;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    private Integer did;
    private String department;

    public int getDuties() {
        return duties;
    }

    public void setDuties(int duties) {
        this.duties = duties;
    }

    private int duties;
    private String education;
    private String nativeplace;

    public void addAttribute() {

    }

}
