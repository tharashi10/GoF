package com.ocs.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ocs.sample.entity.User;
import com.ocs.sample.service.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/user")
    public String user(){
        List<User> userList = userService.getAll();
        for(User u: userList){
            System.out.println(u.getId() + ":" + u.getName());
        }
        return "user";
    }
}
