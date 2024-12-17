package gr.aueb.cf1.ch8;

public class NullPointerExceptionApp {

    public static void main(String[] args) {

        String s = null; //If in String s = "Athens" the the message is equals

        if (s != null && s.equals("Athens")) {
            System.out.println("EQUALS");
        } else {
            System.out.println("NOT EQUALS");
        }
    }
}
