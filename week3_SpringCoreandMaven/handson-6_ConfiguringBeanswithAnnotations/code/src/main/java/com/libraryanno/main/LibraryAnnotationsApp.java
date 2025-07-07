package com.libraryanno.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.libraryanno.service.BookService;

public class LibraryAnnotationsApp {
    public static void main(String[] args) {
    	 try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
             BookService bookService = context.getBean("bookService", BookService.class);
             bookService.displayService();
         }
    }
}