package com.work_final.finalwork.controller;


import com.work_final.finalwork.model.AdminInfo;
import com.work_final.finalwork.service.AdminInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class AdminInfoController {

    @Resource
    private AdminInfoService adminInfoService;

    @RequestMapping("/admin")
    public String admin(Model model){
        AdminInfo adminInfo = adminInfoService.findById("1814080902100");
        model.addAttribute("adminInfo",adminInfo);
        return "BackStage";
    }

    @RequestMapping("/AdminMsgEdit")
    public String AdminMsgEdit(Model model,String admin_account){
        AdminInfo adminInfo = adminInfoService.findById(admin_account);
        model.addAttribute("adminInfo",adminInfo);
        return "AdminInfoEdit";
    }

    @RequestMapping("/admin_edit")
    public String admin_edit(AdminInfo adminInfo){
        adminInfoService.edit(adminInfo);
        return "redirect:/admin";
    }
}
