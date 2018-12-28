package com.controller;

import com.bean.User;
import com.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by ${邹} on 2018/12/28.
 * 描述：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void list() throws Exception {
        List<User> users = userDao.list();
        System.out.println( "user----"+users );
    }

}