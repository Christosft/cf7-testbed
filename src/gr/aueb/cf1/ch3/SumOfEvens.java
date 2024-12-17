package gr.aueb.cf1.ch3;

import java.util.Scanner;

/**
 *Υπολογιζει το αθροισμα των αρτιων απο το 2
 * μεχρι ενα αρτιο που δινει ο χρηστης
 */

public class SumOfEvens {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputnum = 0;
        int sum = 0;
        int  i = 2;

        System.out.println("Please insert upper limit");
        inputnum = in.nextInt();

        while (i <= inputnum) {
            sum+= i;
            i += 2;
        }


        System.out.println("The sum of even numbers up to " + inputnum + " is " +sum);
    }
}
