package com.example.electricalpowersystem2.dao;

import com.example.electricalpowersystem2.entity.Company;
import com.example.electricalpowersystem2.entity.User;
import com.example.electricalpowersystem2.entity.UserDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface user8companyDao {
    @Select("select * from user u join company c on u.cid=c.id")
    @Results({
            @Result(column = "id", property = "user.id"),
            @Result(column = "username", property = "user.username"),
            @Result(column = "password", property = "user.password"),
            @Result(column = "gender", property = "user.gender"),
            @Result(column = "birthday", property = "user.birthday"),
            @Result(column = "phone", property = "user.phone"),
            @Result(column = "cid", property = "user.cid"),
            @Result(column = "name", property = "company.name"),
            @Result(column = "address", property = "company.address")
    })
    public List<UserDto> OneToOne();


    @Select("select * from Company")
    @Results(id="CompanyUserMap" ,value = {
            @Result(id = true,column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "address", property = "address"),
            @Result(column = "id",property = "users",
            many = @Many(select = "com.example.electricalpowersystem2.dao.user8companyDao.getUsersByCid"))
    })
    public List<Company> OntToMany();

    @Select("select * from user where cid=#{cid}")
    public List<User> getUsersByCid(int cid);



}
