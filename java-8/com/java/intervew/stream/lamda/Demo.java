package com.java.intervew.stream.lamda;

public class Demo implements FunctionInterface,MultiFunction{
    @Override
    public void num(int x) {

    }

    @Override
    public void m1() {
        MultiFunction.super.m1();
        System.out.println("m1() ....");
    }


    @Override
    public void add(int x, int y) {

    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1();
    }
}
