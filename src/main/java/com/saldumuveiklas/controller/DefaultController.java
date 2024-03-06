package com.saldumuveiklas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    Student student = new Student();

    // @GetMapping(value = "index.html")
    // ModelAndView index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
    //     ModelAndView modelAndView = new ModelAndView("templates/index.html");
    //     modelAndView.addObject("huina", "AAAAAAAA");
    //     return modelAndView;
    // }
    
    @GetMapping(value = "index.html")
        public ModelAndView passParametersWithModelAndView() {
    ModelAndView modelAndView = new ModelAndView("view/viewPage");
    modelAndView.addObject("huina", "Baeldung");
    return modelAndView;
}
}