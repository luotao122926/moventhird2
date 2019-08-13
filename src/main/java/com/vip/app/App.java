package com.vip.app;

import com.vip.app.dao.impl.UserDaoImpl;
import com.vip.app.entity.User;
import com.vip.app.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //初始化容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //文件
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext();
        //注解
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        //获取容器的对象
        //参数 注册时声明的id
//        User app = (User) context.getBean("app");
//        User app1 = context.getBean("app", User.class);
//        System.out.println(app);
//        System.out.println(app1);
//        System.out.println(app1.getUsername());
//        User user = context.getBean("user", User.class);
//        System.out.println(user);
//        Address address = context.getBean("address", Address.class);
//        System.out.println(address.getPoint());

        UserDaoImpl userDao = context.getBean("userDaoImpl", UserDaoImpl.class);
        System.out.println(userDao);
        UserServiceImpl userService = context.getBean("UserService", UserServiceImpl.class);
        System.out.println(userService);
    }
}
