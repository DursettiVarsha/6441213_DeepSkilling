package com.libraryaop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.libraryaop.service.BookService;

public class LibraryAOPApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.addBook();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
