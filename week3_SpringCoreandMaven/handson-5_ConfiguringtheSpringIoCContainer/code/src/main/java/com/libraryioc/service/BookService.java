package com.libraryioc.service;

import com.libraryioc.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showService() {
        System.out.println("BookService: processing books...");
        bookRepository.displayRepo();
    }
}
