package com.taller.taller1.services;

import com.taller.taller1.models.Book;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookValidator {

    public boolean execute (Book book)
    {
        return validate(book);
    }

    private boolean validate(Book book){


        if(5 > book.getTitle().length() && book.getTitle().length() > 100){
            return false;
        }
        if(book.getDescription().length() > 200){
            return false;
        }
        if(0 > book.getPrice() && book.getPrice() > 10000){
            return false;
        }
        if(String.valueOf(book.getPublishedYear()).length() != 4 && LocalDate.now().getYear() <= book.getPublishedYear() ){
            return false;
        }
        if(0 > book.getPages() && book.getPages() >= 1500){
            return false;
        }


        return true;
    }

}
