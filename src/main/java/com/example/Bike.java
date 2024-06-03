package com.example;

// Starter code for Bike class
public class Bike {

    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;

    // Attributes

    // Add a constructor here
    public Bike(String brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    // Add getter and setter methods here

    // Method to display bike details
    public void displayBikeDetails() {
        System.out.println("Bike Brand " + brand);
        System.out.println("Bike Model " + model);
        System.out.println("Bike price " + price);
        System.out.println("Bike Year " + year);
        System.out.println("Bike Color " + color);
        // TODO: Implement this method
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to update price
    public void updatePrice(double newPrice) {
        // TODO: Implement this method
    }
}
