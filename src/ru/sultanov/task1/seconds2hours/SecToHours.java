package ru.sultanov.task1.seconds2hours;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SecToHours {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд");
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();// Количество секунд
        double hours = seconds / 3600.0; // Количество часов
        System.out.printf("В %d секундах будет %.2f часов", seconds, hours);
    }
}
