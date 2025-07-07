package com.libraryinject.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.libraryinject.service.BookService;

public class LibraryInjectionApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.perform();
        
        ((ClassPathXmlApplicationContext) context).close(); // Close context to avoid leak
    }
}
