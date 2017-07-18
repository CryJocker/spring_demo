package com.wleiy.spring.service.Impl;

import com.wleiy.spring.dao.Impl.UserDaoImpl;
import com.wleiy.spring.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wl_wl on 2017/7/18 0018.
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService {
    UserDaoImpl dao;
@Resource(name = "userDao")
    public void setDao(UserDaoImpl dao) {
        this.dao = dao;
    }

    @Override
    public void add() {
        System.out.println("UserServiceImpl.add...(Service层方法)");
        dao.insert();
    }
}
