package com.pb.golub.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.print("Введите значение operand1: ");
        operand1 = scan.nextInt();
        System.out.print("Введите значение operand2: ");
        operand2 = scan.nextInt();
        System.out.print("Введите арифметическую операцию: ");
        sign = scan.next();
        switch (sign) {
            case "+":
                System.out.println("Ваш ответ = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Ваш ответ = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Ваш ответ = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    System.out.println("Ваш ответ = " + (operand1 / operand2));
                }
                break;
        }
    }
}