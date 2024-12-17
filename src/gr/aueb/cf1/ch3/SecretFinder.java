package gr.aueb.cf1.ch3;

import java.util.Scanner;

/**
 * Υπαρχει ενα SECRET που ειναι integer και ο
 * χρηστης ,ε μια μονο προσπαθεια θα
 * προσπαθησει να τον βρει.
 */

public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found");
        } else {
            System.out.println("FAILURE.I am sorry try again");
        }
    }
}
