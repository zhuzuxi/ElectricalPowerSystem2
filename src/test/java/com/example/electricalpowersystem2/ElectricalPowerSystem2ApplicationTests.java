package com.example.electricalpowersystem2;

import com.example.electricalpowersystem2.dao.userDao;
import com.example.electricalpowersystem2.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class ElectricalPowerSystem2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private userDao userDao;

    @Test
    void test(){
        System.out.println(userDao.getUserId("Arai Nanami"));
    }

    @Test
    void test1(){
        System.out.println(userDao.getUsername(14));
    }

    @Test
    public void testQuery(){

        for (User user : userDao.likeQuery("张")) {
            System.out.println(user);
        }
    }
    @Test
    public void testInQuery(){
        List<Integer> ids=new ArrayList<>();
        Collections.addAll(ids,1,2,33,4);
        for (User user : userDao.inQuery(ids)) {
            System.out.println(user);
        }

//        for (User user : userDao.likeQuery("张")) {
//            System.out.println(user);
//        }
    }

//    @Test
//    void test

}
