package com.pb.golub.hw4;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static void msg1(){
        System.out.println("Введите фразу 1: ");
    }
    static void msg2(){
        System.out.println("Введите фразу 2: ");
    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        msg1();
        String s1 = scan.next();
        char [] c1 = s1.replaceAll("\\s", "").toCharArray();
        msg2();
        String s2 = scan.next();
        char [] c2 = s2.replaceAll("\\s", "").toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        Boolean r = Arrays.equals(c1, c2);
        System.out.println("Ответ: " + r);
    }
}
