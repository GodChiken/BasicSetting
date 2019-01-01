package com.kbh.desk.presentation.controller.general;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;
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
        AsyncRestTemplate rest = new AsyncRestTemplate();
        RestTemplate restTemplate = new RestTemplate();


        return mav;
    }
}
