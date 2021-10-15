package com.pb.golub.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1;
        System.out.print("Введите целое число: ");
        n1 = scan.nextInt();
        if (n1 > -1) {
            if (n1 < 15) {
                System.out.print("Ваш промежуток - [0 - 14]");
            } else if (n1 > 14) {
                if (n1 < 36) {
                    System.out.print("Ваш промежуток - [15 - 35]");
            } else if (n1 > 35) {
                if (n1 < 51 ) {
                    System.out.print("Ваш промежуток - [36 - 50]");
            } else if (n1 > 50) {
                if (n1 < 101) {
                    System.out.print("Ваш промежуток - [51 - 100]");
                }
                }
                }
            }
        }
    }
}
