package gr.aueb.cf1.ch2;


import java.io.PrintStream;

/**
 * Expressions demo.
 */

public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;


        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;


        num1++;
        num1 = num1 + 1;
        num1 +=1;


        int result = sum + sub;
        result1 = num1++;  //εστω num1 = 8, result1 = 8, num1 = 9
        result2 = ++num2;  //εστω num2 = 8, result2 = 9, num1 = 9

        result1 = result1 * 12;
        result1 *= 12;


        System.out.printf("Το αθροισμα των Sum και του Sub  ειναι: " + result);


    }
}
