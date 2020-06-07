package ru.sultanov.task1.salary;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        System.out.println("Введите значение полной зарплаты в рублях");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Вся зарплата
        int b = a - ((a / 100) * 13); // Зарплата за вычетом НДФЛ
        System.out.println("Если полная зарплата составляет " + a
                + " рублей, то за вычетом НДФЛ она будет составлять "
                + b + " рублей");
    }
}