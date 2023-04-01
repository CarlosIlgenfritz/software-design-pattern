package org.pattern.creational.nullobject;

public class Main {
    public static void main(String[] args) {
        Product product = null;
        product = (product != null) ? product : new NullProduct();

        String name = product.getName();
        String description = product.getDescription();
        double price = product.getPrice();

    }
}
