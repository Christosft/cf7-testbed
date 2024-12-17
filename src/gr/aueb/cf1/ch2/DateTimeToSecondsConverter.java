package gr.aueb.cf1.ch2;

import java.util.Locale;
import java.util.Scanner;

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {
        int inputDays = 0;
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds= 0;
        final int SECS_PER_DAY = 3600 * 24;
        final int SECS_PER_HOUR = 3600;
        final int SECS_PER_MIN = 60;

        Scanner in = new Scanner(System.in);

        System.out.println("Please insert days, hours, minutes, seconds");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = inputDays * SECS_PER_DAY + inputHours * SECS_PER_HOUR + inputMinutes * SECS_PER_MIN
                + inputSeconds;

        System.out.printf(Locale.US,"Total seconds: %,d seconds\n", totalSeconds );

    }
}
