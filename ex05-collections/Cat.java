package com.qa.model;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Meow :) ";
    }

    @Override
    public String move() {
        return "If you insist...";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
