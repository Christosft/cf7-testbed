package gr.aueb.cf1.ch2;

import java.util.Scanner;

/**
 * Calculates the prize with vat.
 */
public class PriceWithVat {

    public static void main(String[] args) {
        final double VAT = 0.24;
        double inputPrice = 0.0;
        double priceWithVat= 0.0;
        double vat = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please give product price");
        inputPrice = in.nextDouble();

        vat = inputPrice * VAT;
        priceWithVat = inputPrice + vat;


        System.out.printf("Price: %.2f, vat: %.2f, Price with vat: %.2f" , inputPrice, vat, priceWithVat);


    }
}
