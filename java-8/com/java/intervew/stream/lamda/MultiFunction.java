package com.java.intervew.stream.lamda;

public interface MultiFunction {

    abstract void add(int x, int y);

    default void m1(){
        System.out.println("m1 for multi function");
    }
}
