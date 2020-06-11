package ru.sultanov.task1.gasprice;

import java.util.Scanner;

public class GasPrice {
    final static int LITREPRICE = 45; // цена за литр бензина
    public static void main(String[] args) {
        System.out.println("Введите объем, на который хотите заправиться");
        Scanner sc = new Scanner(System.in);
        int volume = sc.nextInt();
        int price = LITREPRICE * volume; // расчет общей стоимости
        System.out.println("Если цена за литр составляет " + LITREPRICE
                + " рублей, а" + " объем - " + volume
                + " литров, общая цена будет составлять " + price
                + " рублей");

    }
}
