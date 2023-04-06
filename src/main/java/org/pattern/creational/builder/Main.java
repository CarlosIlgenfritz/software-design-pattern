package org.pattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("John Doe")
                .setAge(30)
                .setAddress("123 Main St")
                .setPhoneNumber("555-1234")
                .build();
    }
}
