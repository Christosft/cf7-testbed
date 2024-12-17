package gr.aueb.cf1.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {

    public static void main(String[] args) {
       // try(PrintStream ps = new PrintStream("c:/tmp/file7-ps.txt", StandardCharsets.UTF_8)) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("c:/tmp/file7-ps.txt", true))) {

            printMessage(ps, "hello Coding Factory");
            printMessage(System.out, "Hello CF!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     *
     * @param ps       the input stream
     * @param message  the input message
     */
    public static void printMessage (PrintStream ps, String message) {
        ps.println(message);

    }
}
