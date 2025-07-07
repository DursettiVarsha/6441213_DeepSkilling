package com.librarysetup.main;

import com.librarysetup.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibrarySetupApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            BookService bookService = context.getBean(BookService.class);
            bookService.addBook("Spring Framework Essentials");
        }
    }
}
