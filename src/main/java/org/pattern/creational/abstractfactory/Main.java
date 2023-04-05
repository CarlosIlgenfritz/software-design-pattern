package org.pattern.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new VictorianFurnitureFactory();

        Chair chair = factory.createChair();
        Table table = factory.createTable();

        chair.sit();
        table.use();

        factory = new ModernFurnitureFactory();

        chair = factory.createChair();
        table = factory.createTable();

        chair.sit();
        table.use();
    }
}
