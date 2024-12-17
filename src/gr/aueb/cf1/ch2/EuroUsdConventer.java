package gr.aueb.cf1.ch2;

import java.util.Scanner;

public class EuroUsdConventer {

    public static void main(String[] args) {
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int Parity = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert a integer amount (Euro)");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * Parity;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //\u20AC for euros    \u0024 for dollar

        System.out.printf("%d euros = %d usa dollars and %d usa cents", inputEuros, usaDollars, usaCents);

    }
}
