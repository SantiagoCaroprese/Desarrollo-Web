package com.taller.taller1.controllers;

import com.taller.taller1.models.Book;
import com.taller.taller1.useCases.BookCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookCreatorController {
    private BookCreator bookCreator;

    @Autowired
    public BookCreatorController(BookCreator bookCreator) {
        this.bookCreator = bookCreator;
    }



    @PostMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createBook(@RequestBody Book book) {
        HttpStatus codigo = HttpStatus.OK;
        Boolean resultado = bookCreator.execute(book);
        return ResponseEntity.status(codigo).body(resultado.toString());

    }
}
