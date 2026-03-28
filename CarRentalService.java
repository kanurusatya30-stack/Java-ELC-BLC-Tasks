package com.BLC.ELC;

public class CarRentalService {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setCarId(1);
        c1.setBrand("Toyota");
        c1.setModel("Innova");
        c1.setRentalPricePerDay(2000);

        Car c2 = new Car();
        c2.setCarId(2);
        c2.setBrand("Ford");
        c2.setModel("EcoSport");
        c2.setRentalPricePerDay(1800);

        System.out.println("Car 1: " + c1.getBrand() + " " + c1.getModel());
        System.out.println("Car 2: " + c2.getBrand() + " " + c2.getModel());
    }
}