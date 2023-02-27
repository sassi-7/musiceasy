package com.work_final.finalwork.service;

import com.work_final.finalwork.model.GoodsInfo;
import com.work_final.finalwork.repository.GoodsInfoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {

    @Resource
    private GoodsInfoRepository goodsInfoRepository;

    @Override
    public void sava(GoodsInfo goodsInfo) {
        goodsInfoRepository.save(goodsInfo);
    }

    @Override
    public void delete(String goods_id) {
        goodsInfoRepository.deleteById(goods_id);
    }

    @Override
    public GoodsInfo findById(String goods_id) {
        return goodsInfoRepository.findById(goods_id).orElse(null);
    }

    @Override
    public List<GoodsInfo> findall() {
        return goodsInfoRepository.findAll();
    }

    @Override
    public void edit(GoodsInfo goodsInfo) {
        goodsInfoRepository.save(goodsInfo);
    }
}
