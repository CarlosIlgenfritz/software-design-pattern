package org.pattern.behavioral.strategy;

public class OtherStrategy implements SomeStrategy{
    @Override
    public void execute() {
        System.out.println("Doing some things...");
    }
}
