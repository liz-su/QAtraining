package com.qa.com.qa;

import java.util.Arrays;

public class Book {
    private String name;
    private String[] authors;
    private double price;

    //constructor
    public Book (String name, String[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //toString()

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                '}';
    }
}
