package com.libraryanno.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void displayRepo() {
        System.out.println("BookRepository: Displaying books from repository.");
    }
}
