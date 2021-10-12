package com.fitliving.fitliving.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class contactUsController {

    @GetMapping("/contact-us")
    private String goToContactUs(){
        return "contact-us";
    }

    @PostMapping("/contact-us")
    private String redirectContactUs(){
        return "redirect:/contact-us";
    }
}
