package com.BLC.ELC;

public class Shoppingcart {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setProductId(1);
        p1.setProductName("Laptop");
        p1.setPrice(50000);
        p1.setQuantity(2);

        Product p2 = new Product();
        p2.setProductId(2);
        p2.setProductName("Mobile");
        p2.setPrice(20000);
        p2.setQuantity(5);

        // Update quantity
        p1.setQuantity(3);
        p2.setQuantity(6);

        System.out.println("Product 1: " + p1.getProductName() + " Price: " + p1.getPrice());
        System.out.println("Product 2: " + p2.getProductName() + " Price: " + p2.getPrice());
    }
}