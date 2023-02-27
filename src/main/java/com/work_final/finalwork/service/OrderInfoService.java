package com.work_final.finalwork.service;

import com.work_final.finalwork.model.OrderInfo;

import java.util.List;

public interface OrderInfoService {

    //增
    public void save(OrderInfo orderInfo);
    //删
    public void delete(String order_id);
    //查单个
    public OrderInfo findById(String order_id);
    //查全部
    public List<OrderInfo> findall();
    //改
    public void edit(OrderInfo orderInfo);
}
