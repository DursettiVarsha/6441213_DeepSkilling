package com.librarysetup.service;

import com.librarysetup.model.Book;
import com.librarysetup.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void addBook(String title) {
        Book book = new Book(title);
        System.out.println("BookService: Adding book - " + title);
        bookRepository.save(book);
    }
}
