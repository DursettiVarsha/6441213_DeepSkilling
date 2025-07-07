package com.libraryaop.service;

import com.libraryaop.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("Adding book...");
        bookRepository.saveBook();
    }
}
