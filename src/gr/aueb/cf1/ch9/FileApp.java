package gr.aueb.cf1.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        File fd = new File("c:/tmp/file7.txt"); //java turns it to c:\tmp\file7.txt
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("\\s +");

                for (String token : tokens) {
                    System.out.print(token.trim() + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}