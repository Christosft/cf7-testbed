package gr.aueb.cf1.ch3;

import java.io.CharArrayReader;
import java.util.Scanner;

/**
 * Turn lights on, if it is raining && car is running or is dark
 */

public class LightsOn {

    public static void main(String[] args) {

        final int MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        boolean isDark = false;
        boolean lightsOn = false;
        boolean isCarRunning;
        int carSpeed;
        Scanner in = new Scanner(System.in);

        System.out.println("Please is it raining: ");
        isRaining = in.nextBoolean();

        System.out.println("Please is it dark: ");
        isDark = in.nextBoolean();

        System.out.println("Please car speed");
        carSpeed = in.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;
        lightsOn = isRaining && (isDark || isCarRunning);

        System.out.println("Lights on: " + lightsOn);

    }
}
