package com.taller.taller1.services;

import com.taller.taller1.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookRepository {

    private List<Book> books;

    public BookRepository(){
        books = new ArrayList<>();
        Book book = new Book("1984", "George", 1949, 20d,"Orwell","Dystopic",400);
        Book book2 = new Book("Count of Monte Cristo", "Alexander", 1844, 16d,"Dumas","This is a revenge story",800);
        Book book3 = new Book("The Way of Kings", "Brandon", 2010, 30d,"Sanderson","Fantasy world in a made up world",1040);
        Book book4 = new Book("Hunger Games", "Suzanne", 2008, 14d,"Collins","Alternative universe. A failed rebellion",500);
        books.add(book);
        books.add(book2);
        books.add(book3);
        books.add(book4);
    }

    public void persistir(Book book){
        books.add(book);
    }

    public List<Book> byAuthorBooks(String authorFirstName,String authorLastName){
        List<Book> authorBooks = new  ArrayList();
        for(Book b : books){
            if(b.isAuthor(authorFirstName,authorLastName)){
                authorBooks.add(b);
            }
        }
        return authorBooks;
    }

    public String bookDetailCard(String title){
        for(Book b : books){
            if(b.getTitle().equals(title)){
                return b.createBookCard();
            }
        }
        return "NOT_FOUND";
    }

}
