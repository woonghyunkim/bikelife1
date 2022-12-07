package com.example.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String main() {
        return "index";
    }

//    로그인 화면 이동
    @GetMapping("signin")
    public String login() {
        return "views/user/signin";
    }

    @PostMapping("signin")
    public String login(Model model, HttpServletRequest request) throws Exception {
        return "index";
    }

//    회원가입 화면 이동
    @GetMapping("signup")
    public String signup() {
        return "views/user/signup";
    }

    //라이딩 화면 이동
    @GetMapping("riding")
    public String riding() {
        return "views/user/riding";
    }

    //플랙스 화면 이동
    @GetMapping("flex")
    public String flex() {
        return "views/user/flex";
    }

    //커뮤니티 화면 이동
    @GetMapping("community")
    public String community() {
        return "views/user/community";
    }

    //어바웃 화면 이동
    @GetMapping("about")
    public String about() {
        return "views/user/about";
    }












}