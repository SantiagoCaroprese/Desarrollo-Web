package com.taller.taller1.models;

public class Book {
    private String title;
    private String authorFirstName;
    private Integer publishedYear;
    private Double price;
    private String authorLastName;
    private String description;
    private Integer pages;

    public Book(String title, String authorFirstName, Integer publishedYear, Double price, String authorLastName, String description, int pages) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.publishedYear = publishedYear;
        this.price = price;
        this.authorLastName = authorLastName;
        this.description = description;
        this.pages = pages;
    }

    public String createBookCard()
    {
        return "The book " + this.title + " Description " + this.description + " Precio " +
                this.price + ". Publication year " + this.publishedYear + " Pages number " + this.pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public Double getPrice() {
        return price;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPages() {
        return pages;
    }

    public boolean isAuthor(String authorFirstName, String authorLastName){
        if(this.authorFirstName.equals(authorFirstName)){
            if(this.authorLastName.equals(authorLastName)){
                return true;
            }
        }
        return false;
    }
}
