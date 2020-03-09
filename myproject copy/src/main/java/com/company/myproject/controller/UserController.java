package com.company.myproject.controller;

import com.company.myproject.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class UserController {



    @RequestMapping(path = "/user/login")
    public ModelAndView login(ModelAndView modelAndView) {
        System.out.println("Baku ");
        modelAndView.setViewName("user/login");
        return modelAndView;

    }

    @RequestMapping(path = "/")
    public ModelAndView index(ModelAndView modelAndView) {
        System.out.println("Baku1 ");
        modelAndView.setViewName("index");
        return modelAndView;

    }

    @RequestMapping(path = "/user/registration")
    public ModelAndView register(ModelAndView modelAndView) {
        modelAndView.addObject("user", new User());
        modelAndView.setViewName("user/register");
        return modelAndView;
    }
}
