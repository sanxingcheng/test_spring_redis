package com.xjcheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xjche on 2017/6/7.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(HttpServletRequest request) {
        request.getSession().setAttribute("springtest", "test");
        return "/index.jsp";
    }
}