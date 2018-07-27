package com.kbh.desk.presentation.controller.general;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping(value = "/")
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index(HttpSession httpSession) {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
    @RequestMapping("/test")
    public ModelAndView test(HttpSession httpSession) {
        ModelAndView mav = new ModelAndView("test");
        return mav;
    }
}
