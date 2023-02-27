package com.work_final.finalwork.service;


import com.work_final.finalwork.model.AdminInfo;

public interface AdminInfoService {

    //增
    public void save(AdminInfo adminInfo);
    //删
    public void delete(String admin_account);
    //查
    public AdminInfo findById(String admin_account);
    //改
    public void edit(AdminInfo adminInfo);
}
