package gr.aueb.cf1.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης θα δινει : 1. τους συνολικους βαθμους μαθηματων
 * 2. το πληθος των μαθηματων και το προγραμμα θα υππολογιζει τον μεσο ορο
 * και θα χαρακτηριζει με αριστα αν ο μεσος ορος θα ειναι πανω απο 9, πολυ καλα
 * αν ο μεσος ορος ειναι πανω απο 7 και καλως αν ο μεσος ορος ειναι πανω απο 5 και fail αν ο μεσος ορος
 * ειναι κατω απο 5.
 */

public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;
        int courseCount = 0;
        int average = 0;

        System.out.println("Please insert total Marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be zero.");
            System.exit(1);
        }

        System.out.println("Please insert courses count.");
        courseCount = scanner.nextInt();

        if (courseCount <= 0) {
            System.out.println("Courses must not be negative or zero");
            System.exit(1);
        }

        average = totalMarks / courseCount;

        if (average > 10) {
            System.out.println("Error. The average must be less or equal tha 10.");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Failure");
        }
    }
}
