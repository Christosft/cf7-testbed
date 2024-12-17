package gr.aueb.cf1.ch8;

import java.util.Scanner;

public class SimpleBank {

    static double balance = 500;
    static double deposit;
    static double newBalance;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       try {
           System.out.println("please insert your deposit:");
           deposit = in.nextInt();
           newBalance = balance + deposit;
           System.out.println("The new balance is: " + newBalance);
       } catch (Exception e) {
           System.out.println("An error happened. Try again...");
       }

    }

    public static void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } catch (IllegalArgumentException e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }

    }
}
