package com.libraryinject.service;

import com.libraryinject.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Constructor Injection: BookRepository injected.");
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection: BookRepository injected.");
    }

    public void perform() {
        bookRepository.display();
    }
}
