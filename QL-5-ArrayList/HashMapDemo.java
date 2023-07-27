package com.qa;

import java.util.Map;

public class HashMap {
    public void nothing(){
        Map<String, String> food = new HashMap<>();
        String put = food.put("France", "Croissant");
        food.put("Vietnam","Pho");
        food.put("Burma","Mohinga");

        System.out.println(food.get("Burma"));

        for (Map.Entry<String, String> s: ){
            System.out.println(s);
        }

        for (String s: food.keySet()){
            System.out.println(s);
        }
        for (String s: food.values()){
            System.out.println(s);
        }
    }
}
