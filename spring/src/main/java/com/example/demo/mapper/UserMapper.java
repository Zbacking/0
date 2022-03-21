package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper  {
      @Select("SELECT * from user")
    List<User> findAll();

    @Insert("INSERT into user(username,password,nick_name,sex,age,address)VALUES(#{username},#{password},#{nick_name},#{sex},#{age},#{address})")
    int insert(User user);
    int update(User user);
    @Delete("delete from user where id = #{id}")
    Integer deleteById(@Param("id") Integer id);
    @Select("select * from user  where username like concat ('%',#{username},'%') limit #{pageNum}, #{pageSize}")
    List<User> selectPage(Integer pageNum, Integer pageSize, String username);
    @Select("select count(*) from user  where username like concat ('%',#{username},'%') ")
    Integer selectTotal(String username);


}
