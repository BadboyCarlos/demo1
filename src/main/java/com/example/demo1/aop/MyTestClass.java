package com.example.demo1.aop;

import com.example.demo1.mypro.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: Carlos Lv
 * @version: v1.0
 * @description: com.example.demo1.aop
 * @date:2019/3/17
 */
@Component
public class MyTestClass implements MyTestClassInterface {

    @Override
    public Long testLong(){

        return 1L;
    }
    @Override
    public Integer testInteger(){

        return 2;
    }
    @Override
    public User testUser(User user){
        user.setName("fff");
        user.setPhone("1321321321");
        user.setSex("man");
        return user;
    }
}
