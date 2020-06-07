package ru.sultanov.task1.game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int max = 100;
        int min = 0;
        int a = (int) (Math.random() * (((max - min) + 1) - min));
        System.out.println("Попробуйте угадать число которое я загадал");
        Scanner sc = new Scanner(System.in);
        int b = 0;
        for (int i = 0; i < 20; i++) {
            int c = sc.nextInt();
            if ((Math.abs(a - c)) > (Math.abs(a - b))) {
                System.out.println("Холодно!");
                b = c;
            }
            if ((Math.abs(a - c)) < (Math.abs(a - b))) {
                System.out.println("Горячо!");
                b = c;
            }
            if ((Math.abs(a - c)) == 0) {
                System.out.println("Вы угадали!");
                break;
            }

        }
        System.out.println("Было загадано " + a);

    }

}
