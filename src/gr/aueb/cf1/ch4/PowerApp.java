package gr.aueb.cf1.ch4;

/*Calculates a^n.
e.g 2^10 = 1024.
 */

import java.math.BigInteger;

public class PowerApp {
    public static void main(String[] args) {
        BigInteger BigResult = new BigInteger("1");
        int base = 2;
        int power = 10;
        int result = 1;

        //for to calculate base^power
        for (int i = 1; i <= power; i++) {
            result = result * base; //result *= base
        }

        System.out.println("Result: " + result);
    }
}
