package gr.aueb.cf1.ch3;

import java.util.Scanner;

/**
 *Snowing if raining AND temp < 0.
 */

public class SnowingApp {

    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;
        int temp = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if it is raining ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert Temperature ");
        temp = in.nextInt();

        isSnowing = isRaining && temp < 0;

        System.out.println("Is snowing: " + isSnowing);
    }

}
