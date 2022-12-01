package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

//    @Autowired
//    //CityService cityservice;


    @GetMapping("/")
    public String main() {
        return "index";
    }


    @GetMapping("join")
    public String join() {
        return "/member/join";
    }

    @GetMapping("test")
    public ModelAndView test() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("fragments/page");
        return mv;
    }






}