package de.nordakademie.microservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @GetMapping(path = "/fragment")
    public ModelAndView fragment() {
        ModelAndView modelAndView = new ModelAndView("fragment");
        modelAndView.addObject("title", "Test Fragment");
        return modelAndView;
    }

}
