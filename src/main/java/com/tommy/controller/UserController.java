package com.tommy.controller;

import com.tommy.data.entity.User;
import com.tommy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: tommy_Z
 * @Date: 2019/7/22
 */

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public String login(User user){
        if (userService.login(user))
            return user.toString();
        return "false";
    }

    @RequestMapping("/main")
    public String hello(){
        return "login";
    }
}
