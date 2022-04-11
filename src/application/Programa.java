package application;

import utils.CurrencyConverter;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();
        System.out.println("How mane dollars will be bought?");
        double manyDollar = scanner.nextDouble();
        double result = CurrencyConverter.totalOfPay(dollarPrice, manyDollar);
        System.out.printf("Amount to pay in reais is: %.2f", result);

        scanner.close();
    }
}
