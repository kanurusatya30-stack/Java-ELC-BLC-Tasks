package com.BLC.ELC;

public class Library {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.setBookId(1);
        b1.setTitle("Java Basics");
        b1.setAuthor("James");
        b1.setPrice(500);

        Book b2 = new Book();
        b2.setBookId(2);
        b2.setTitle("Python Guide");
        b2.setAuthor("Guido");
        b2.setPrice(600);

        System.out.println("Book 1: " + b1.getTitle() + " by " + b1.getAuthor());
        System.out.println("Book 2: " + b2.getTitle() + " by " + b2.getAuthor());
    }
}