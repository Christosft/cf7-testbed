package gr.aueb.cf1.ch3;

/**
 * Linearized the branches and check
 * errors first.
 */

import java.util.Scanner;

public class SecretFinderErrorHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        final int SECRET = 12;
        boolean success = false;

        while (true) {
            System.out.println("Insert a num to guess the secret");
            num = scanner.nextInt();

            if (num != SECRET) {
                System.out.println("Try again");
                continue;
            }
            System.out.println("bingo!");
            break;
        }
    }
}