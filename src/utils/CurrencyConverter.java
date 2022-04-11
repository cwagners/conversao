package utils;

import java.util.Scanner;

public class CurrencyConverter {

        public final static double  IOF = 0.06;

    public static double totalOfPay(double value, double taxValue){

            return value * taxValue * (1.0 + IOF);

        }

}
