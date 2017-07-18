package com.wleiy.spring.controller;

import com.wleiy.spring.service.Impl.UserServiceImpl;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.naming.Name;

/**
 * Created by wl_wl on 2017/7/18 0018.
 */
@Controller(value = "controller")
public class UserController {
    UserServiceImpl service;
@Resource(name = "userService")
    public void setService(UserServiceImpl service) {
        this.service = service;
    }

    public void putOut(){
        System.out.println("UserController.putOut....(Servlet层方法)");
        service.add();
    }
}
