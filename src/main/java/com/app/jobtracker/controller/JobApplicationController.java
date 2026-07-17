package com.app.jobtracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobApplicationController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
