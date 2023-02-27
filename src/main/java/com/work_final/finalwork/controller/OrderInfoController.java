package com.work_final.finalwork.controller;

import com.work_final.finalwork.model.OrderInfo;
import com.work_final.finalwork.service.OrderInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderInfoController {

    @Resource
    private OrderInfoService orderInfoService;

    @RequestMapping("/OrderInfo")
    public String OrderInfo(Model model){
        List<OrderInfo> orderInfos = orderInfoService.findall();
        model.addAttribute("orderInfos",orderInfos);
        return "OrderInfo";
    }

    @RequestMapping("/order_delete")
    public String order_delete(String order_id){
        orderInfoService.delete(order_id);
        return "redirect:OrderInfo";
    }
}
