package gr.aueb.cf1.ch2;

/**
 * x = 10
 * y = 85
 * d = 30
 */

public class FrogJumpsApp {

    public static void main(String[] args) {

        int start = 10;
        int target = 85;
        int hop = 30;
        int jumps = 0;

        jumps = (int)Math.ceil ((target - start) / (double) hop);

        System.out.println("Jumps: " + jumps);
        System.out.printf("Jumps %d" ,  jumps);

    }
}
