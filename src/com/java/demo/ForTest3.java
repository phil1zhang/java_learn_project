package com.java.demo;

import java.util.Scanner;

public class ForTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数： ");
        int m = scanner.nextInt();
        System.out.println("请输入第二个数： ");
        int n = scanner.nextInt();

        /*下面来处理约数*/

        int min = (m <= n) ? n : m;
        for (int i = min; i > 1; i++) {
            if ((i % m == 0) && (i % n == 0)) {
                System.out.println("最小公倍数数是： " + i);
                break;
            }
        }

    }
}
