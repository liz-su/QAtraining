package com.qa.Object;

public class Car {
    //attributes
    private String brand;
    private String make;
    private int horsePower;

    //default constructor
    public Car(){}
    public Car(String brand, String make, int horsePower){
        this.brand = brand;
        this.make = make;
        this.horsePower = horsePower;
    }

    //getters and setters
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void getBrand(String brand){
        return this.brand;
    }

    //toString()

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", make='" + make + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
