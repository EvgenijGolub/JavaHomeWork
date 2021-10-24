package com.pb.golub.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите одномерный массив целых чисел");
        int counter = 0;
        int x1;
        x1 = scan.nextInt();
        int x2;
        x2 = scan.nextInt();
        int x3;
        x3 = scan.nextInt();
        int x4;
        x4 = scan.nextInt();
        int x5;
        x5 = scan.nextInt();
        int x6;
        x6 = scan.nextInt();
        int x7;
        x7 = scan.nextInt();
        int x8;
        x8 = scan.nextInt();
        int x9;
        x9 = scan.nextInt();
        int x10;
        x10 = scan.nextInt();
        int[] array = new int[10];
        array[0] = x1;
        array[1] = x2;
        array[2] = x3;
        array[3] = x4;
        array[4] = x5;
        array[5] = x6;
        array[6] = x7;
        array[7] = x8;
        array[8] = x9;
        array[9] = x10;
        System.out.println("Ваш массив чисел");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println("Сумма всех чисел Вашего массива:" + (x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10));
            if (array[i] > 0) ;
            counter++;
        }
        System.out.println("Количество положительных элементов = " +counter);
    boolean isSorted = false;
    int buf;
    while(!isSorted) {
        isSorted = true;
        for (int i=0; i< array.length-1; i++) {
            if (array[i]>array[i+1]) {
                isSorted = false;

                buf = array[i];
                array[i] = array[i+1];
                array[i+1]=buf;
            }
        }
    }
    System.out.println(Arrays.toString(array));
    }
}

