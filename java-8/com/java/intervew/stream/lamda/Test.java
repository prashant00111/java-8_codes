package com.java.intervew.stream.lamda;

public class Test {
    public static void main(String[] args) {
        FunctionInterface fn = (int x) -> {
            System.out.println("Lamda expression : " + 2*x);
        };

        MultiFunction mFn = (int x,int y) -> {
            System.out.print("Addition : " + x*y);
        };
        fn.num(2);
        mFn.add(20,9);
    }
}
