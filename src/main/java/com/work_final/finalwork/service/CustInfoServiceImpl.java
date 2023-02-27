package com.work_final.finalwork.service;

import com.work_final.finalwork.model.CustInfo;
import com.work_final.finalwork.repository.CustInfoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class CustInfoServiceImpl implements CustInfoService {

    @Resource
    private CustInfoRepository custInfoRepository;

    @Override
    public void save(CustInfo custInfo) {
        custInfoRepository.save(custInfo);
    }

    @Override
    public void delete(String cust_account) {
        custInfoRepository.deleteById(cust_account);
    }

    @Override
    public CustInfo findById(String cust_account) {
        return custInfoRepository.findById(cust_account).orElse(null);
    }

    @Override
    public List<CustInfo> findall() {
        return custInfoRepository.findAll();
    }

    @Override
    public void edit(CustInfo custInfo) {
        custInfoRepository.save(custInfo);
    }
}
