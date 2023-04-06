package org.pattern.creational.builder;

public class PersonBuilder {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Person build() {
        return new Person(name, age, address, phoneNumber);
    }
}
