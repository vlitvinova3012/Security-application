package com.example.securityapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailController {
    @RequestMapping("/")
    public String getIndexPage() {
        return "index";
    }
}
