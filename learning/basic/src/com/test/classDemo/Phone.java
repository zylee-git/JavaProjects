package com.test.classDemo;

public class Phone {
    private String brand;
    private double price;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void call() {
        System.out.println(brand + " Phone call");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
