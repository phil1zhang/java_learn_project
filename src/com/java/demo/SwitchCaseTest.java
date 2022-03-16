package com.java.demo;
import java.util.Scanner;


public class SwitchCaseTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("please in:");
        String word = scan.next();
        char c = word.charAt(0);
        switch (c){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            default:
                System.out.println("other");





        }

    }
}
