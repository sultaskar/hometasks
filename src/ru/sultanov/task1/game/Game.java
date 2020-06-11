package ru.sultanov.task1.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    final static int TRY = 20;
    public static void main(String[] args) {
        int max = 100;
        int min = 0;
        Random random = new Random();
        int mysticNum = random.nextInt(100);
        System.out.println("Попробуйте угадать число которое я загадал");
        Scanner sc = new Scanner(System.in);
        int prevUserNum = 0;
        for (int i = 0; i < TRY; i++) {
            int userNum = sc.nextInt();
            if ((Math.abs(mysticNum - userNum)) > (Math.abs(mysticNum - prevUserNum))) {
                System.out.println("Холодно!");
                prevUserNum = userNum;
            } else if ((Math.abs(mysticNum - userNum)) == 0) {
                System.out.println("Вы угадали!");
                break;
            } else {
                System.out.println("Горячо!");
                prevUserNum = userNum;
            }
        }
        System.out.println("Было загадано число " + mysticNum);

    }

}
