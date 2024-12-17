package gr.aueb.cf1.ch3;

import java.util.Scanner;

public class Sentinel2 {

    public static void main(String[] args) {
        int positivesCounts = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        System.out.println("Please insert a num");


        while ((inputNum = in.nextInt()) >=0) {
            positivesCounts++;
            System.out.println("Please insert a num");

        }

        System.out.println("Positives count: " + positivesCounts);
    }
}
