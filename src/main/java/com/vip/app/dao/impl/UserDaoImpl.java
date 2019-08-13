package com.vip.app.dao.impl;

import com.vip.app.dao.IUserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
    @Override
    public void save() {
        System.out.println("save方法");
    }
}
