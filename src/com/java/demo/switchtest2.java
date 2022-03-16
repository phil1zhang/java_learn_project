package com.java.demo;
import java.util.Scanner;


class switchte1st2 {
    public static void main(String[] args){
    Scanner sacnner = new Scanner(System.in);
    System.out.println("please input your year: ");
    int year = sacnner.nextInt();
    System.out.println("please input your month: ");
    int month = sacnner.nextInt();
    System.out.println("please input your date: ");
    int date = sacnner.nextInt();
    int sumdays = 0;
    switch(month){
        case 12:
            sumdays += 30;
        case 11:
            sumdays += 31;
        case 10:
            sumdays += 30;
        case 9:
            sumdays += 31;
        case 8:
            sumdays += 31;
        case 7:
            sumdays += 30;
        case 6:
            sumdays += 31;
        case 5:
            sumdays += 30;
        case 4:
            sumdays += 31;
        case 3:
           // sumdays += 28;
            if((year % 4 == 0 && year % 400 !=0 ) || (year % 400 == 0)){
                sumdays += 29;
            }else{
                sumdays += 28;
            }
        case 2:
            sumdays += 31;
        case 1:
            sumdays = sumdays + date;
    }
        System.out.println("total " + sumdays + " days");



    }
}
