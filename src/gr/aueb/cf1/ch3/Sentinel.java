package gr.aueb.cf1.ch3;

import java.util.Scanner;

/**
 * Calculate the positive counts.
 */

public class Sentinel {

    public static void main(String[] args) {
        int positivesCounts = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        while (inputNum >=0) {
            positivesCounts++;
            System.out.println("Please insert a num");
            inputNum = in.nextInt();
        }

        System.out.println("Positives count: " + positivesCounts);
    }
}
