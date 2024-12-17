package gr.aueb.cf1.ch3;

import java.util.Scanner;

/**
 * Δικαιωμα ψηφου σε ηλικιες > 18
 * Ελεφχει αν μια ηλικια ειχει δικαιωμα ψηφου
 */

public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int VOTEAGE = 18;
        int age = 0;
        boolean isEligible = false;

        System.out.println("Please give the age (integer)");
        age = in.nextInt();

        isEligible = age >= VOTEAGE;

        System.out.println("He/she can vote: " + isEligible);
        System.out.printf("Your age %d is eligible %b for voting", age, isEligible);
    }
}
