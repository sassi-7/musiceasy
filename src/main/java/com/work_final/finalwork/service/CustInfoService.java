package com.work_final.finalwork.service;

import com.work_final.finalwork.model.CustInfo;

import java.util.List;

public interface CustInfoService {

    //增
    public void save(CustInfo custInfo);
    //删
    public void delete(String cust_account);
    //查单个
    public CustInfo findById(String cust_account);
    //查所有
    public List<CustInfo> findall();
    //改
    public void edit(CustInfo custInfo);
}
