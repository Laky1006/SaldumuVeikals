package com.saldumuveiklas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    @GetMapping(value = "index.html")
    ModelAndView index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}