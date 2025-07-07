package com.librarysetup.repository;

import com.librarysetup.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void save(Book book) {
        System.out.println("BookRepository: Saved book - " + book.getTitle());
    }
}
