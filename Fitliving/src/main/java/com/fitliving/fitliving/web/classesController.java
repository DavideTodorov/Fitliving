package com.fitliving.fitliving.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class classesController {

    @GetMapping("/classes")
    public String goToClasses() {
        return "classes";
    }


}
