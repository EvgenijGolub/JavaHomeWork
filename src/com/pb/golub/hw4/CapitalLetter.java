package com.pb.golub.hw4;

import java.util.Scanner;

public class CapitalLetter {
public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    String s1 = scan.next();
    String s2 = "";

    s2 = s2 + s1.substring(0, 1).toUpperCase();
    for (int i = 1; i < s1.length(); i++) {
        if (" ".equals(s1.substring(i-1, i)))
            s2 = s2 + s1.substring(i, i+1).toUpperCase();
        else
            s2 = s2 + s1.substring(i, i+1);
        System.out.println(s2);
    }
    }
}