package com.java.demo;

public class ForTest2 {
    public static void main(String[] args) {

        for (int i = 1;i < 151 ;i++){
            System.out.print(i  +" ");

            if(i % 3 == 0){
                System.out.print("FOO ");
            };
            if(i % 5 == 0){
                System.out.print("biz ");
            };
            if(i % 7 == 0){
                System.out.print("baz ");
            };
            System.out.println();
        }


    }
}
