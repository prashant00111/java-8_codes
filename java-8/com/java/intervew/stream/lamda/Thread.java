package com.java.intervew.stream.lamda;

import java.util.function.Function;

import static java.lang.Thread.sleep;

public class Thread {
    public static void main(String[] args) {

        Runnable even = () ->{
            for(int i =0 ;i<10; i++){
                try {
                    sleep(990);
                    if (i %2 ==0){
                        System.out.println("thread -1  : " + i);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable odd = () ->{
            for(int i =0 ;i<10; i++){
                try {
                    sleep(1000);
                    if (i %2 !=0){
                        System.out.println("thread -2  : " + i);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };

//        Runnable alphabet = () ->{
//            for(int i =0 ;i<10; i++){
//                try {
//                    sleep(997);
//                        System.out.println("thread -3  : " +"A" +i);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//            }
//        };

        java.lang.Thread t1 = new java.lang.Thread(even);
        java.lang.Thread t2 = new java.lang.Thread(odd);
       // java.lang.Thread t3 = new java.lang.Thread(alphabet);
        t1.start();
        t2.start();
      //  t3.start();
    }
}
