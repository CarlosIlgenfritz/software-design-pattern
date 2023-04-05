package org.pattern.creational.factory;

// Concrete Creator: SedanFactory class
public class SedanFactory implements CarFactory {
    public Car createCar() {
        return new Sedan();
    }
}
