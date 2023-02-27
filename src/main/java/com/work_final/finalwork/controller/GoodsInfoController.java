package com.work_final.finalwork.controller;

import com.work_final.finalwork.model.GoodsInfo;
import com.work_final.finalwork.service.GoodsInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GoodsInfoController {

    @Resource
    private GoodsInfoService goodsInfoService;

    @RequestMapping("/GoodsInfo")
    public String GoodsInfo(Model model){
        List<GoodsInfo> goodsInfos = goodsInfoService.findall();
        model.addAttribute("goodsInfos",goodsInfos);
        return "GoodsInfo";
    }

    @RequestMapping("/GoodsInfoEdit")
    public String GoodsInfoEdit(Model model,String goods_id){
        GoodsInfo goodsInfo = goodsInfoService.findById(goods_id);
        model.addAttribute("goodsInfo",goodsInfo);
        return "GoodsInfoEdit";
    }

    @RequestMapping("/goods_edit")
    public String goods_edit(GoodsInfo goodsInfo){
        goodsInfoService.edit(goodsInfo);
        return "redirect:/GoodsInfo";
    }

    @RequestMapping("/goods_delete")
    public String goods_delete(String goods_id){
        goodsInfoService.delete(goods_id);
        return "redirect:/GoodsInfo";
    }
}
