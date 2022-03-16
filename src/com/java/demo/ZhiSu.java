package com.java.demo;

public class ZhiSu {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 2; i < 100000; i++) {

//            System.out.println("系统运行时间" + start);

            int k = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k = k + 1;
                    if (k < 2) {
                        System.out.println("质数是" + i);
                        long end = System.currentTimeMillis();
                        System.out.println("系统运行时间" + (end - start));
                        break;
                }
            }

            }
        }
    }
}

