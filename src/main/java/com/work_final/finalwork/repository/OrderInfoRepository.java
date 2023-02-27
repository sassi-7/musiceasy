package com.work_final.finalwork.repository;

import com.work_final.finalwork.model.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoRepository extends JpaRepository<OrderInfo,String> {
}