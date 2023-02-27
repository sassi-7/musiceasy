package com.work_final.finalwork.service;

import com.work_final.finalwork.model.AdminInfo;
import com.work_final.finalwork.repository.AdminInfoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminInfoServiceImpl implements AdminInfoService {

    @Resource
    private AdminInfoRepository adminInfoRepository;

    @Override
    public void save(AdminInfo adminInfo) {
        adminInfoRepository.save(adminInfo);
    }

    @Override
    public void delete(String admin_account) {
        adminInfoRepository.deleteById(admin_account);
    }

    @Override
    public AdminInfo findById(String admin_account) {
        return adminInfoRepository.findById(admin_account).orElse(null);
    }

    @Override
    public void edit(AdminInfo adminInfo) {
        adminInfoRepository.save(adminInfo);
    }
}
