package org.pattern.creational.factory;

// Concrete Creator: SUVFactory class
public class SUVFactory implements CarFactory{
    public Car createCar() {
        return new SUV();
    }
}
