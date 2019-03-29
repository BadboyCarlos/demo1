package com.example.demo1;

import com.example.demo1.aop.MyTestClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {
    private Logger logger = org.slf4j.LoggerFactory.getLogger(Demo1ApplicationTests.class);
    @Test
    public void contextLoads() {
    }

    @Test
    public void testAop(){
        logger.info("testAop method begin................");
        MyTestClass myTestClass = new MyTestClass();
        System.out.println("aaaaaaaaaaa");
        myTestClass.testLong();
//        logger.info("The value is {}", l);
        System.out.println("bbbbbbbbbbb");
        logger.info("testAop method end..................");
    }
}
