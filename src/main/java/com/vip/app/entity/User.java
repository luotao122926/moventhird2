package com.vip.app.entity;

import com.vip.app.Address;

import java.io.Serializable;

public class User implements Serializable {
    //阿里规范里面定义属性类型时,要用包装类
    private Integer uid;
    private String username;
    private String password;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    public User() {
    }

    public void init(){
        System.out.println("初始化");
    }

    public void close(){
        System.out.println("销毁");
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
