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











}