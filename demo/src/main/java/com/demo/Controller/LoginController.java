package com.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hasee on 2018/5/8.
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/login")
    public String login(){return "login";}
}
