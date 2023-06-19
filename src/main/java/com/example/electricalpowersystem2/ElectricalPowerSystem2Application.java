package com.example.electricalpowersystem2;

import com.example.electricalpowersystem2.dao.userDao;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@MapperScan("com.example.electricalpowersystem2.dao")
public class ElectricalPowerSystem2Application {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ElectricalPowerSystem2Application.class, args);
        userDao bean = context.getBean(userDao.class);
        System.out.println(bean);
    }

}
