package com.example.demo1.mypro.controller;

import com.example.demo1.mypro.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/templates")
public class HelloController {
    @RequestMapping("/hello")
//    public String hello(){
//        return "Hello Lv";
//    }
    public ModelAndView hello(ModelAndView mv){
        mv.setViewName("Hello");
        mv.addObject("user","deggg");
        mv.addObject("name","你好，邓子其");
        return mv;

    }

    public List<User> getUser(){
        List<User> list = new ArrayList<User>();
        User u1 = new User("小明","男" ,"1111111");
        User u2 = new User("小红","女" ,"2222222");
        User u3 = new User("小张","男" ,"3333333");
        User u4 = new User("小赵","男" ,"4444444");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        return list;
    }


}
