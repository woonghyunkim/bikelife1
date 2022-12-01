package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

//    @Autowired
//    //CityService cityservice;


    @GetMapping("/")
//    public String main(Model model) {
    public String main() {
//        try {
//            List<CityDTO> list = cityservice.getall();
//            model.addAttribute("citylist",list);
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        model.addAttribute("center","maincenter");
        return "index";
    }

}