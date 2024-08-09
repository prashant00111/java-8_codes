package com.java.intervew.stream.array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i <= 10; i++){
            al.add(i);
        }
        System.out.print(al);
        System.out.println();
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()){
            Integer num =itr.next();
            if(num % 2==0){
                System.out.println(num);
            }else {
                itr.remove();
            }
        }
        System.out.println(al);
    }
}
