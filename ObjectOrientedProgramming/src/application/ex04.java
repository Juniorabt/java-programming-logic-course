package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

/*Write a program to read the dollar rate, and then a value in dollars to be purchased for
a real person. Inform how many reais the person will pay for the dollars, also considering
that the person will have to pay 6% IOF on the dollar value. Create a CurrencyConverter class
to be responsible for the calculations. */

public class ex04 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollar will be bought? ");
        double amount = sc.nextDouble();

        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);
        sc.close();

    }
}
