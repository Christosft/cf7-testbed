package gr.aueb.cf1.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResources {

    public static void main(String[] args) {

        int num = 0;

        try (Scanner in = new Scanner(System.in)) {
            num = in.nextInt();
            System.out.println(num);

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}