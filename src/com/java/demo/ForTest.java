package com.java.demo;

public class ForTest {
    public static void main(String[] args){
     int sum=0;
     int count = 0 ;
for(int i = 1 ;i<100;i++) {
    if (i % 2 == 0) {
        System.out.println("num=  " + i);
        sum += i;
        count +=1;
    }
}
        System.out.println("sum=  " + sum);
        System.out.println("count=  " + count);
    }
}
