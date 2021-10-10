package com.fitliving.fitliving.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class bookClassesController {

    @GetMapping("bookClasses")
    public String goToBookClasses(){
        return "bookClasses";
    }

    @PostMapping("/bookClasses")
    public String bookClass(){
        return "redirect:/bookClasses";
    }
}
