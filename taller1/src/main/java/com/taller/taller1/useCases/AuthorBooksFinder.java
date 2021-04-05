package com.taller.taller1.useCases;

import com.taller.taller1.models.Book;
import com.taller.taller1.services.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorBooksFinder {

    BookRepository repository;

    @Autowired
    public AuthorBooksFinder(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> execute(String authorFirstName,String authorLastName) {
        return repository.byAuthorBooks(authorFirstName,authorLastName);
    }

}
