package com.qa.model;

public class Rabbit extends Animal {
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String sayHello() {
        return "Rabbit says Hello";
    }

    @Override
    public String move() {
        return "Hopping";
    }
}
