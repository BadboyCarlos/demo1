package com.example.demo1;

import com.example.demo1.aop.MyTestClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan("com.example.demo1.aop")
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        MyTestClass myTestClass = new MyTestClass();
        System.out.println("aaaaaaaaaaaaa");
        myTestClass.testLong();
        System.out.println("bbbbbbbbbbbbb");
    }
}
