package ru.sultanov.task1.gasprice;

import java.util.Scanner;

public class GasPrice {
    public static void main(String[] args) {
        System.out.println("Введите объем, на который хотите заправиться");
        Scanner sc = new Scanner(System.in);
        int volume = sc.nextInt();
        int litr_price = 45; // цена за литр бензина
        int price = litr_price * volume; // расчет общей стоимости
        System.out.println("Если цена за литр составляет " + litr_price
                + " рублей, а" + " объем - " + volume
                + " литров, общая цена будет составлять " + price
                + " рублей");

    }
}
