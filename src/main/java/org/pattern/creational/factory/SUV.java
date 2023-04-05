package org.pattern.creational.factory;

// Concrete Product: SUV class
public class SUV implements Car{
    private String model = "SUV";
    private String description = "A versatile car with ample cargo space.";
    private double price = 30000.0;

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
