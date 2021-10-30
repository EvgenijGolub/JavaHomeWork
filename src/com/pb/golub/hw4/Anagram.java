package com.pb.golub.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фразу 1: ");
        String s1 = scan.next();
        System.out.println("Введите фразу 2: ");
        String s2 = scan.next();
        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();
        Boolean r = Arrays.equals(c1, c2);
        System.out.println("Ответ: " + r);
    }
}
