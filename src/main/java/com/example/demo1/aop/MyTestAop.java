package com.example.demo1.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


/**
 * @author: Carlos Lv
 * @version: v1.0
 * @description: com.example.demo1.aop
 * @date:2019/3/17
 */
@Component
@Aspect
public class MyTestAop {

    private Logger logger = LoggerFactory.getLogger(MyTestAop.class);

    @Pointcut("execution(public * *(..)))")
    public void pointCuts(){
    }

//    @Before("execution(* com.example.demo1.aop.MyTestClass.testLong())")
    @Before("pointCuts()")
    public void advices(){
        logger.info("-----------------------AOP BEGIN----------------------");
        System.out.println("");
//        if (rvt instanceof Long){
//            logger.info("This is Long returning value : {}",(Long)rvt);
//        }
//        if (rvt instanceof Integer){
//            logger.info("This is Integer returning value : {}",(Integer)rvt);
//        }
        logger.info("------------------------AOP END-----------------------");
    }
}
