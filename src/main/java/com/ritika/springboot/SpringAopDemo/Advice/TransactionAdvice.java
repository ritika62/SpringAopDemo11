package com.ritika.springboot.SpringAopDemo.Advice;

import com.ritika.springboot.SpringAopDemo.Entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Slf4j
@Aspect
@Component
@Order(3)
public class TransactionAdvice {

  @Pointcut("execution(* com.ritika.springboot.SpringAopDemo.Service.BookService.*(..))")
  public void TransactionAdvice() {
  }

  @Before("TransactionAdvice()")
  public void before() {
    log.info("Transaction Begin");
  }

  @After("TransactionAdvice()")
  public void after() {
    log.info("Transaction Commit");
  }

  @AfterThrowing("SecurityAdvice()")
  public void AfterThrowing() {
    log.info("Transaction Rollback");
  }
}


