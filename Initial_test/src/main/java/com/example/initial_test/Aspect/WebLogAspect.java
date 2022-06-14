package com.example.initial_test.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(1)
public class WebLogAspect {
    @Pointcut("execution(* com.example.initial_test.Controller.BookController.getBook(..))")
    public void pointcut(){}

   @Before("pointcut()")
    public void before(){
       System.out.println("before");
   }

   @After("pointcut()")
    public void after(){
       System.out.println("after");
   }



}
