package com.java.demo;

public class OperatorTest {
    public static void main(String[] args) {
        int num1 = 10,num2 = 21,num3 = -10;
        int max;
        if(num1 >=num2 && num1 >=num3){
            max = num1;
        }else if(num2 >=num1 && num2 >=num3){
            max=num2;
        }else{
            max=num3;
        };
        System.out.println(max);
        double d1 = 12.3;
        double d2 = 23.4;
        if(d1>10 && d2 < 20){
            System.out.println("sum=" + (d1 + d2));
        }else{
            System.out.println("cha = " + (d1 * d2));
        }

        String s1 = "china";
        String s2 = "japan";
        String tmp = s1;
        s1 = s2;
        s2 = tmp;
        System.out.println("s1 = " + s1 + " , s2 = " + s2);
    }
}
