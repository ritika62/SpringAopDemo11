package com.ritika.springboot.SpringAopDemo.Advice;

import com.ritika.springboot.SpringAopDemo.Entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Aspect
@Component
@Order(1)
public class LoggingAdvice {

  @Pointcut("within(com.ritika.springboot.SpringAopDemo..*)")
  public void loggingPointCut() {
  }

  @Around("loggingPointCut()")
  public Object before(ProceedingJoinPoint joinPoint) throws Throwable {

 log.info("Before method invoked::" + joinPoint.getSignature());
    Object object = joinPoint.proceed();
    log.info("After method invoked.." + joinPoint.getSignature());
    return object;
  }
}

