package com.java.demo;
import java.util.Scanner;

public class Dog {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入狗狗的年龄：");
        int YY = scan.nextInt();
        if (YY <= 5){
            System.out.println("狗狗");
        }
    }
}
