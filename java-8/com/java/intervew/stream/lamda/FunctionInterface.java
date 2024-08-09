package com.java.intervew.stream.lamda;

public interface FunctionInterface {

    public abstract void num(int x);

    default void m1(){
        System.out.println("Default method");
    }
}
