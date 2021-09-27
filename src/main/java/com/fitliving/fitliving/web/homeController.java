package com.fitliving.fitliving.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/index")
    public String goToHome() {
        return "index";
    }

    @GetMapping("/aboutUs")
    public String goToAboutUs() {
        return "aboutUs";
    }

    @GetMapping("/classes")
    public String goToClasses() {
        return "classes";
    }
}
