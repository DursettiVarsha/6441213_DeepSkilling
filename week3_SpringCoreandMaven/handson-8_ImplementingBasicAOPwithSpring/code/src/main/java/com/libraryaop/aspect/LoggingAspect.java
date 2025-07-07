package com.libraryaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.libraryaop.service.BookService.addBook(..))")
    public void beforeAdvice() {
        System.out.println("Before method: Logging started.");
    }

    @After("execution(* com.libraryaop.service.BookService.addBook(..))")
    public void afterAdvice() {
        System.out.println("After method: Logging completed.");
    }
}
