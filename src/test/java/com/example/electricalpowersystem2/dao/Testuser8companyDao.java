package com.example.electricalpowersystem2.dao;

import com.example.electricalpowersystem2.entity.Company;
import com.example.electricalpowersystem2.entity.User;
import com.example.electricalpowersystem2.entity.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Testuser8companyDao {
    @Autowired
    private user8companyDao user8companyDao;

    @Test
    public void testOneToOne(){
        for (UserDto userDto : user8companyDao.OneToOne()) {
            System.out.println(userDto);
        }
    }

    @Test
    public void testOneToMany(){
        for (Company company : user8companyDao.OntToMany()) {
            System.out.println(company);
        }
    }
}
