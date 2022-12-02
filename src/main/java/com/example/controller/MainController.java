package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String main() {
        return "index";
    }

//    로그인 화면 이동
    @GetMapping("signin/view.do")
    public String login() {
        return "views/user/signin";
    }

//    회원가입 화면 이동
    @GetMapping("signup/view.do")
    public String signup() {
        return "views/user/signup";
    }









}