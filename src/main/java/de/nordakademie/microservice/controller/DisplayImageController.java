package de.nordakademie.microservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DisplayImageController {

    @GetMapping("/displayImage")
    public ModelAndView displayImage(@RequestParam String url, @RequestParam(required = false, defaultValue = "0") Integer rotate) {
        ModelAndView modelAndView = new ModelAndView("display-image");
        modelAndView.addObject("imageUrl", url);
        modelAndView.addObject("rotate", rotate);
        return modelAndView;
    }


}
