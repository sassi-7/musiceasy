package com.work_final.finalwork.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForegroundController {

    @RequestMapping("/")
    public String Index(){
        return "index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/Instrument")
    public String Instrument(){
        return "Instrument";
    }

    @RequestMapping("/ShopCar")
    public String ShopCar(){
        return "ShopCar";
    }

    @RequestMapping("/About")
    public String About(){
        return "About";
    }

    @RequestMapping("/Feedback")
    public String Feedback(){
        return "Feedback";
    }

    @RequestMapping("/Login")
    public String Login(){
        return "Login";
    }

    @RequestMapping("/Register")
    public String Register(){
        return "Register";
    }
}
