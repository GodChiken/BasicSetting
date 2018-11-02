package com.kbh.desk.presentation.controller.general;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


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
