package com.java.intervew.stream.lamda;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMap {
    public static void main(String[] args) {
        Map<Integer,String> m = new TreeMap<>((o1, o2) -> (o1 > o2)? -1: (o1 < o2) ? 1 : 0);
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("After sorting : " + m);
    }
}
