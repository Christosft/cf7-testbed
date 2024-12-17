package gr.aueb.cf1.ch7;

import java.util.Scanner;

public class IOstrApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please insert two strings");
        s1 = in.next();  //διαβαζει μεχρι να βρει white spaces (spaces, tabs \t, new lines \n)
        s2 = in.nextLine();   //διαβαζει μεχρι να βρει next line \n

        System.out.printf("s1: %s\n" , s1);
        System.out.printf("s2: %s\n" , s2);
    }
}
