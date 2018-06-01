package com.hcc.studyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HtmlController {

    //跳转登录页面
    @RequestMapping("hello")
    public String login() {
        return "hello";
    }

}
