package com.example.demo.entity;


import lombok.Data;

@Data

public class User {

    private Integer id;
    private String username;
    private  String password;
    private  String nick_name;
    private String sex;
    private Integer age;
    private  String address;
}
