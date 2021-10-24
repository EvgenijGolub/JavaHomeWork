package com.pb.golub.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Попробуйте отгадать целое число в диапазоне от 0 до 100");
        System.out.println("Для завершения введите '-1'");

        final int MAX_ATTEMPT = 9000;
        int attempt = 0;

        Random random = new Random();
        int x = random.nextInt(101);
        Scanner scan = new Scanner(System.in);
        int y;

        while (attempt < MAX_ATTEMPT) {
            attempt++;
            System.out.println("Попытка: " + attempt);
            y = scan.nextInt();

            if (y==-1) {
                break;
            }

            if (y > x) {
                System.out.println("Ваше число больше загаданного");
                continue;
            }

            if (y < x) {
                System.out.println("Ваше число меньше загаданного");
                continue;
            }

            if (y == x) {
                continue;
            }

            System.out.println("Вы угадали с " + attempt + " попытки");
            break;
        }

        System.out.println("Конец игры");
    }
}