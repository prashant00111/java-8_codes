package com.java.intervew.stream.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLamdaDemo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(110);
        arr.add(458);
        arr.add(421);
        arr.add(321);
        arr.add(253);
        arr.add(165);
        arr.add(264);
        System.out.println("before sorting : " + arr );
        System.out.println("------------------------------------------");
        Collections.sort(arr,(a1,a2) -> (a1 > a2) ? -1 : (a1 < a2) ? 1 : 0);
        System.out.println("After sorting : " + arr);
    }
}
