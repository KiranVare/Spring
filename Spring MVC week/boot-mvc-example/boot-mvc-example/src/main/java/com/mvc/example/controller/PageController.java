package com.mvc.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RequestMapping("/pages")
@RestController
public class PageController {

//    @RequestMapping("/about")
//    public String about()
//    {
//        System.out.println("This is about page");
//        return "about";
//    }

    @RequestMapping("/about")
//    @ResponseBody //--> to resolve view
    public String about(Model model)
    {
        System.out.println("This is about page");
        model.addAttribute("name","Spring MVC Example");
        return "about";
    }




}
