package org.pattern.creational.nullobject;

public class NullProduct implements Product{
    public String getName() {
        return "";
    }

    public String getDescription() {
        return "";
    }

    public double getPrice() {
        return 0.0;
    }
}
