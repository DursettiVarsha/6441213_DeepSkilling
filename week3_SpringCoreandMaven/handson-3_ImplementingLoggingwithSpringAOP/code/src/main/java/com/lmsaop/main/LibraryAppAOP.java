package com.lmsaop.main;

import com.lmsaop.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryAppAOP {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            BookService service = context.getBean("bookService", BookService.class);
            service.addBook("Advanced Spring AOP");
        }
    }
}
