package gr.aueb.cf1.ch10;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        //int result = 0;
    try {
        System.out.println("Παρακαλω δωστε τον πρωτο ακεραιο: ");
        num1 = in.nextInt();
        System.out.println("Παρακαλω δωστε τον δευτερο ακεραιο: ");
        num2 = in.nextInt();
        //data binding
        if (num2 == 0) {
            System.out.println("Ο δευτερος ακερραιοσ δεν μπορει να ειναι 0");
            num2 = in.nextInt();
        }

        System.out.println(add(num1, num2));
        System.out.println(sub(num1, num2));
        System.out.println(mul(num1, num2));
        System.out.println(div(num1, num2));
        System.out.println(mod(num1, num2));

    } catch (InputMismatchException e) {
        System.out.println("Η εισοδος πρεπει να ειναι ακεραιος");
    } catch (Exception e) {
        System.out.println("Λαθος στον υπολογισμο. Δεν μπορει να γινει διαιρεση με το 0 ");
    }
    }

    public static int add(int a, int b) {
        return  a + b;
    }

    public static int sub(int a, int b) {
        return a-b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) throws Exception {
        try {
            if (b == 0) throw new Exception("Error. Denominator must not be zero");
            return a / b;
        } catch (Exception e) {
            System.err.println("Error. " +e.getMessage());
            throw e;
        }
    }

    public static int mod(int a, int b) throws Exception {
        try {
            if (b == 0) throw new Exception("Error. Denominator must not be zero");
            return a % b;
        } catch (Exception e) {
            System.err.println("Error. " +e.getMessage());
            throw e;
        }
    }
}
