package gr.aueb.cf1.ch3;

import java.util.Scanner;

/**
 * Δινει ως output τον πολλαπλασιασμο ενος
 * ακεραιου που δινει ο χρηστης με ολους τους ακεραιους
 * απο 1 - 10.
 */

public class MultiplicationTable {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num;
      int i = 1;

        System.out.println("Enter an integer");
        num = scanner.nextInt();

        while (i <= 10) {
            System.out.println(num+ " * " + i + " = " + (num * i));

            //System.out.printf("%d * %2d = %2d\n", num, i, num * 1);

            //System.out.println("The result is" + sum);
            i++;
        }

    }
}
