package com.example.electricalpowersystem2.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private int id;
    private String username;
    private String password;
    private int gender;
    private Date birthday;
    private String phone;



}
