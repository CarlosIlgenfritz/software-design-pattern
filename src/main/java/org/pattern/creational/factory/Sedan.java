package org.pattern.creational.factory;

// Concrete Product: Sedan class
public class Sedan implements Car {
    private String model = "Sedan";
    private String description = "A family car with spacious interior.";
    private double price = 20000.0;

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
