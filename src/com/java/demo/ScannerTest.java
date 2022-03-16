package com.java.demo;

import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的姓名：");

        String name = scan.next();

        System.out.println(name);

    }
}
