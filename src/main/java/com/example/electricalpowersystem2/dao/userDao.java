package com.example.electricalpowersystem2.dao;

import com.example.electricalpowersystem2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface userDao {
    @Select("select id from user where username=#{username}")
    public int getUserId(@Param("username") String name);

    @Select("select username from user where id=#{id}")
    public String getUsername(int id);

    @Select("select * from user where username like concat('%',#{username},'%')")
    public List<User> likeQuery(@Param("username")String username);

    public List<User> inQuery(List<Integer> ids);


}
