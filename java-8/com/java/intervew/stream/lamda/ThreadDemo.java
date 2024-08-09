package com.java.intervew.stream.lamda;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable basic = () -> {
            for(int i =0; i<=10; i++){
               if(i % 2 ==0){
                   try{
                       java.lang.Thread.sleep(993);
                       System.out.println("Thread - 1 : " + i);
                   }catch (InterruptedException e){
                       throw new RuntimeException("Kaam nahi hua");
                   }
               }else if(i % 2 !=0){
                   try{
                       java.lang.Thread.sleep(1000);
                       System.out.println("Thread - 2 : " + i);
                   }catch (InterruptedException e){
                       throw new RuntimeException("Kaam nahi hua");
                   }
               }
            }
        };
        java.lang.Thread t1 = new java.lang.Thread(basic);
        java.lang.Thread t2 = new java.lang.Thread(basic);
        t1.start();
        t2.start();
    }
}
