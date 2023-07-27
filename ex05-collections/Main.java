package com.qa;

import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;

import java.util.ArrayList;
import java.util.Iterator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cat a1 = new Cat("Jason",10);
        Dog a2 = new Dog("Joe",1);
        Cat a3 = new Cat("Jack",12);
        Dog a4 = new Dog("Matthew",3);
        Rabbit a5 = new Rabbit("Alex",6);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        ArrayList<Cat> cats = new ArrayList<Cat>();

        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
        animals.add(a5);

        //for loop
//        for (int i = 0; i < animals.size(); i++){
//            System.out.println(animals.get(i));
//        }

        //for-each loop
//        for (Animal i : animals){
//            System.out.println(i);
//        }

        //iterator
        System.out.println("Iterator");
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()){
            Animal i = iterator.next();
            System.out.println(i);
        }
    }
}
