package com.java.demo;

import java.util.Scanner;

public class Random1 {
    public static void main(String[] args){
        int value = (int)(Math.random() * 90 + 10);
        System.out.println(value);

        int numShi = value/10;
        int numGe = value%10;

        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个两位数： ");
        int guess = input.nextInt();


        int guessGe = guess%10;
        int guessShi = guess/10;

        if(value == guess){
            System.out.println("奖金1w美金");
        }else if(numGe == guessGe  && numShi == guessShi){
            System.out.println("奖金3K美金");
        }else if(numGe == guessShi || numShi == guessGe){
            System.out.println("奖金300美金");
        }else if(numGe == guessGe || numShi == guessShi){
            System.out.println("奖金1K美金");
        }else{
            System.out.println("未匹配，无奖金");
        }

        System.out.println("中奖号码是： " + value);
    }

}

