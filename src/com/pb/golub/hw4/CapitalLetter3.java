package com.pb.golub.hw4;

import java.util.Scanner;

public class CapitalLetter3 {
    static void msg(){
        System.out.println("Введите строку");
    }
public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    msg();
    String s1 = scan.next();
    String s2 = "";
    for(int i=0; i< (s1.length());i++){
        if(s1.charAt(i)==' '){
            s2 = s2.substring(0,i+1)+s1.substring(i+1,i+2).toUpperCase()+s1.substring(i+2);
            }else if (i==0){
            s2=s1.substring(0,1).toUpperCase()+s1.substring(1);
        }
    }
    System.out.println(s2);
}
}