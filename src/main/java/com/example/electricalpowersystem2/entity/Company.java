package com.example.electricalpowersystem2.entity;

import lombok.Data;

import java.util.List;

@Data
public class Company {
    private int id;
    private String name;
    private String address;

    private List<User> users;

}
