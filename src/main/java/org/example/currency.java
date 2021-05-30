package org.example;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double amount_from = input.nextDouble();

        System.out.print("What is the current exchange rate in Euros? ");
        double rate_from = input.nextDouble();

        System.out.print("What is the current exchange rate in Dollars? ");
        double rate_to = input.nextDouble();

        double amount_to = (amount_from * rate_from) / rate_to;

        System.out.println(amount_from + " Euros is " + amount_to + " U.S. Dollars.");
    }
}
