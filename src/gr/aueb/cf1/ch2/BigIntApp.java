package gr.aueb.cf1.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo
 */


public class BigIntApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("12345678998765432199990");
        BigInteger bigNum2 = new BigInteger("12121654984898498489844");
        BigInteger result;

        result = bigNum1.add(bigNum2);


        System.out.printf("%, d", result);


    }


}
