package com.pb.golub.hw8;

import java.util.Arrays;
import java.util.Scanner;

public class Auth {

    public void singUp(String login, String password) {

        String confirmPassword;

        int loginLenght = login.length();
        char[] loginChar = toString().toCharArray();
        String[] charSymbols1 = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h",
                "j", "k", "k", "l", "z", "x", "c", "v", "b", "n", "m"};

        int passwordLenght = password.length();
        char[] passwordChar = toString().toCharArray();
        String[] charSymbols2 = new String[]{"_", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h",
                "j", "k", "k", "l", "z", "x", "c", "v", "b", "n", "m"};


        public void checklogin1 () {
            if (loginLenght >= 5) {
                Scanner scanner = new Scanner(login);
            } else if (loginLenght <= 20) {
                Scanner scanner = new Scanner(login);
                throw new WrongLoginException();

                public void checklogin2 () {
                    if (Arrays.equals(loginChar, charSymbols1)) {
                        Scanner scanner = new Scanner(login);
                    } else {
                        Scanner scanner = new Scanner(login);
                        throw new WrongLoginException();
                    }
                }
            }
        }
        public void checkPassword1 () {
            if (passwordLenght > 5) {
                Scanner scanner = new Scanner(password);
            } else {
                Scanner scanner = new Scanner(password);
                throw new WrongPasswordException();

            }
        }
    }
}