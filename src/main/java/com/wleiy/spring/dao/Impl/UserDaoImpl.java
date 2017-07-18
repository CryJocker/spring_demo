package com.wleiy.spring.dao.Impl;

import com.wleiy.spring.dao.IUserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by wl_wl on 2017/7/18 0018.
 */
@Repository(value = "userDao")
public class UserDaoImpl implements IUserDao {
    @Override
    public void insert() {
        System.out.println("UserDaoImpl.insert...(Dao层insert方法)");
    }
}
