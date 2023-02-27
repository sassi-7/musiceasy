package com.work_final.finalwork.controller;


import com.work_final.finalwork.model.AdminInfo;
import com.work_final.finalwork.model.CustInfo;
import com.work_final.finalwork.service.CustInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CustInfoController {

    @Resource
    private CustInfoService custInfoService;

    @RequestMapping("/CustInfo")
    public String CustInfo(Model model){
        List<CustInfo> custInfos = custInfoService.findall();
        model.addAttribute("custInfos",custInfos);
        return "CustInfo";
    }

    @RequestMapping("/CustInfoEdit")
    public String CustInfoEdit(Model model,String cust_account){
        CustInfo custInfo = custInfoService.findById(cust_account);
        model.addAttribute("custInfo",custInfo);
        return "CustInfoEdit";
    }

    @RequestMapping("/cust_edit")
    public String cust_edit(CustInfo custInfo){
        custInfoService.edit(custInfo);
        return "redirect:/CustInfo";
    }

    @RequestMapping("/cust_delete")
    public String cust_delete(String cust_account){
        custInfoService.delete(cust_account);
        return "redirect:/CustInfo";
    }
}
