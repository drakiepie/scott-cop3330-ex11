package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;

/*
 *  UCF COP3330 Summer 2021 Exercise 11 Solution
 *  Copyright 2021 Drake Scott
 */

public class currency {
    static DecimalFormat df = new DecimalFormat("$#,##0.00");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double amount_from = input.nextDouble();

        System.out.print("What is the exchange rate? ");
        double rate = input.nextDouble();

        double finalAmt = amount_from * rate;

        System.out.println(amount_from + " Euros at an exchange rate of " + rate + " is " + df.format(finalAmt)
                + " U.S. Dollars.");
    }
}
