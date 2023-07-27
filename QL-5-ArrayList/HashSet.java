package com.qa;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public void doSomething(){
        Set<Integer> num = new java.util.HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println(num.isEmpty());
        System.out.println(num.size());

        num.remove(3);
        num.clear();
        num.contains(4);

        Iterator<Integer> iterator = num.iterator();

        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (i.equals(2)){
                iterator.remove(2);
            }
        }
    }
}
