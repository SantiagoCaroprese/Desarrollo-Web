package com.taller.taller1.useCases;

import com.taller.taller1.models.Book;

import com.taller.taller1.services.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookCardFinder {

    BookRepository repository;

    @Autowired
    public BookCardFinder(BookRepository repository) {
        this.repository = repository;
        }

    public String execute(String title) {
        return repository.bookDetailCard(title);
    }
}
