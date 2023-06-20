package com.example.electricalpowersystem2.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUserDao {
    @Autowired
    private userDao userDao;
    @Test
    public void testDel(){
        System.out.println(userDao.del(9));
    }
}
