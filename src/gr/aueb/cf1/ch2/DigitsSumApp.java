package gr.aueb.cf1.ch2;

import java.util.Scanner;

public class DigitsSumApp {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputDigit = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sum = 0;

        System.out.println("Please give a two digit number");
        inputDigit = in.nextInt();

        leftDigit = inputDigit / 10; //Με div 10 παιρνουμε το αριστερο ψηφιο
        rightDigit = inputDigit % 10; //Με mod 10 παιρνουμε το δεξι ψηφιο
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d, Left digit: %d, Right digit: %d, Sum: %d", inputDigit, leftDigit, rightDigit,
                sum);

    }
}
