package org.pattern.creational.monostate;

public class Main {
    public static void main(String[] args) {
        Monostate obj1 = new Monostate();
        Monostate obj2 = new Monostate();
        obj1.setSharedState(42);
        System.out.println(obj2.getSharedState());
    }
}
