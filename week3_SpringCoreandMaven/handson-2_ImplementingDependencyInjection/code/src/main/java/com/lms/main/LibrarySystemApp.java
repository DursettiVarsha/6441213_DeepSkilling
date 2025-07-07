package com.lms.main;

import com.lms.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibrarySystemApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService bookService = context.getBean("bookService", BookService.class);
            bookService.addBook("Spring Boot for Beginners");
        }
    }
}
