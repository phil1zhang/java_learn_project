package com.java.demo;
import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args){

        Scanner scaner = new Scanner(System.in);

        System.out.println("请输入第一个整数： ");
        int num1 = scaner.nextInt();
        System.out.println("请输入第二个整数： ");
        int num2 = scaner.nextInt();
        System.out.println("请输入第三个整数： ");
        int num3 = scaner.nextInt();

        if (num1 > num2){
            if (num3 > num1){
                System.out.println(num2 +"," + num1 + ","+ num3);
                }else if(num3 <= num2){
                    System.out.println(num3 +"," +  num2 + ","+ num1);
                }else{
                    System.out.println(num2 + ","  + num3 +"," +num1);
                }
        }else{
            if (num3 >= num2){
                System.out.println(num1 + ","  + num2 +"," +num3);
            }else if(num3 <= num1){
                System.out.println(num3 + "," +  num1 +"," +num2);
            }else{
                System.out.println(num1 + ","  + num3 +"," +num2);
            }
        }
    }
}
