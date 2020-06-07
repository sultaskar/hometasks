package ru.sultanov.task1.seconds2hours;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SecToHours {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();// Количество секунд
        double b = (double) a / 3600; // Количество часов
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("В " + a + " секундах будет " + df.format(b) + " часов");
    }
}
