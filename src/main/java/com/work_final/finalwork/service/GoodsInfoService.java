package com.work_final.finalwork.service;

import com.work_final.finalwork.model.GoodsInfo;

import java.util.List;

public interface GoodsInfoService {

    //增
    public void sava(GoodsInfo goodsInfo);
    //删
    public void delete(String goods_id);
    //查单个
    public GoodsInfo findById(String goods_id);
    //查全部
    public List<GoodsInfo> findall();
    //改
    public void edit(GoodsInfo goodsInfo);
}
