package com.java.demo;

import java.util.Scanner;

public class IfExer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入身高 ： （cm）");
        int height = scan.nextInt();
        System.out.println("请输入财富 ： （千万）");
        double wealth = scan.nextDouble();
        System.out.println("请输入长相 ：(true/false) ");
        boolean look = scan.nextBoolean();

        if(height >=180 && wealth >=1 && look){
            System.out.println("我一定要嫁给他");
        }else if(height >=180 || wealth >=1 || look){
            System.out.println("我可能嫁给他");
        }else{
            System.out.println("我不可能嫁给他");
        }
    }
}
