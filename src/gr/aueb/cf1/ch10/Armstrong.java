package gr.aueb.cf1.ch10;

import java.util.Scanner;

/**
 * 153 => 1^3 + 5^3 + 3^3
 */

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("Please give a number: ");
        num = scanner.nextInt();
        int originalNum = num;
        int numberOfDigits =String.valueOf(num).length();


        while (num != 0) /* or num > 0*/ {
            int digit = num % 10;  // Παίρνουμε το τελευταίο ψηφίο
            sum += (int) Math.pow(digit, numberOfDigits);  // Υψώνουμε το ψηφίο στην δύναμη του αριθμού των ψηφίων και το προσθέτουμε
            num /= 10;  // Αφαιρούμε το τελευταίο ψηφίο από τον αριθμό
        }

        System.out.printf("%d%s Armstrong", originalNum, (sum == originalNum) ? " is" : " is not");

        // Ελέγχουμε αν το άθροισμα είναι ίσο με τον αρχικό αριθμό
        /*if (sum == originalNum) {
            System.out.println(originalNum + " είναι αριθμός Armstrong.");
        } else {
            System.out.println(originalNum + " δεν είναι αριθμός Armstrong.");*/
        }

}

