package com.demo.Controller;

import com.demo.Bean.User;
import com.demo.DAO.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hasee on 2018/5/8.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/license")
    public String license(String loginName, String passWord, Model model){
        User user = userDao.findUser(loginName, passWord);
        if(user != null){
            model.addAttribute("userName" ,user.getLocalName());
            model.addAttribute("userEmail" ,user.getEmail());
            return "hello";
        }else{
            model.addAttribute("userLoginName" ,loginName);
            return "index";
        }
    }
}