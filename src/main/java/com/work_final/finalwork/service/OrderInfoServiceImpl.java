package com.work_final.finalwork.service;

import com.work_final.finalwork.model.OrderInfo;
import com.work_final.finalwork.repository.OrderInfoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Resource
    private OrderInfoRepository orderInfoRepository;

    @Override
    public void save(OrderInfo orderInfo) {
        orderInfoRepository.save(orderInfo);
    }

    @Override
    public void delete(String order_id) {
        orderInfoRepository.deleteById(order_id);
    }

    @Override
    public OrderInfo findById(String order_id) {
        return orderInfoRepository.findById(order_id).orElse(null);
    }

    @Override
    public List<OrderInfo> findall() {
        return orderInfoRepository.findAll();
    }

    @Override
    public void edit(OrderInfo orderInfo) {
        orderInfoRepository.save(orderInfo);
    }
}
