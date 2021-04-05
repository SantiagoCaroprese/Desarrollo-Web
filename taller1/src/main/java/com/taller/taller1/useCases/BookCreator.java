package com.taller.taller1.useCases;

import com.taller.taller1.models.Book;
import com.taller.taller1.services.BookRepository;
import com.taller.taller1.services.BookValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookCreator {
    BookValidator validador;
    BookRepository repository;


    @Autowired
    public BookCreator(BookRepository repository) {
        this.validador = new BookValidator();
        this.repository = repository;
    }

    public Boolean execute(Book newBook)
    {

        if (!validador.execute(newBook))
        {
            return false;
        }
        repository.persistir(newBook);
        return true;
    }

}
