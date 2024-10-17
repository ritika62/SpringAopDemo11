package com.ritika.springboot.SpringAopDemo.Advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
@Order(2)
public class SecurityAdvice {

  @Pointcut("execution(* com.ritika.springboot.SpringAopDemo.Service.BookService.*(..))")
  public void SecurityAdvice() {}


  @Before("SecurityAdvice()")
  public void before() {
    log.info("Verified User");
  }



}

