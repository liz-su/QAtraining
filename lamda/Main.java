package com.qa;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        lamda();
    }
    public void lamda(){
        List<String> names = new ArrayList<>();
        names.add("Joe");
        names.add("Harry");
        names.add("Liz");
        names.add("Cris");
        names.add("Sha");

        names.forEach(firstNames -> System.out.println(firstNames));

        //advanced
        names.forEach(System.out::println);

        //logic in a list
        names.forEach(firstNames -> {
            if (!firstNames.equals("Joe")) System.out.println(firstNames);
        });

    }
}
