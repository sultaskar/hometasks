package ru.sultanov.task1.salary;

import java.util.Scanner;

public class Salary {
    final static double TAX = 0.13;
    public static void main(String[] args) {
        System.out.println("Введите значение полной зарплаты в рублях");
        Scanner sc = new Scanner(System.in);
        int wholeSalary = sc.nextInt(); // Вся зарплата
        double result = wholeSalary - (wholeSalary * TAX); // Зарплата за вычетом НДФЛ
        System.out.printf("Если полная зарплата составляет %d рублей, то за" +
                " вычетом НДФЛ она будет составлять %.2f рублей", wholeSalary,
                result);
    }
}