package org.pattern.creational.abstractfactory;

public class VictorianChair implements Chair{
    @Override
    public void sit() {
        System.out.println("Sitting on a Victorian chair.");
    }
}
