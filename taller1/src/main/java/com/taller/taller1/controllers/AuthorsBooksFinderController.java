package com.taller.taller1.controllers;

import com.taller.taller1.models.Book;
import com.taller.taller1.useCases.AuthorBooksFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorsBooksFinderController {
    private AuthorBooksFinder authorBooksFinder;

    @Autowired
    public AuthorsBooksFinderController(AuthorBooksFinder authorBooksFinder) {
        this.authorBooksFinder = authorBooksFinder;
    }



    @GetMapping (value = "/books/authors/{authorLastName}/{authorFirstName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Book>> findAuthorBooks(@PathVariable("authorFirstName") String firstName, @PathVariable("authorLastName") String lastName) {
        HttpStatus codigo = HttpStatus.OK;
        List<Book> librosAutor = authorBooksFinder.execute(firstName,lastName);
        return ResponseEntity.status(codigo).body(librosAutor);
    }

}
