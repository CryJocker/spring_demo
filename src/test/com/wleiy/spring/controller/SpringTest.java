package com.wleiy.spring.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by wl_wl on 2017/7/18 0018.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/aplicationContext.xml")
public class SpringTest {
    @Resource(name = "controller")
    UserController controller;


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void putOut() throws Exception {
        System.out.println("SpringTest.putOut...(测试类方法)");
        controller.putOut();
    }

}