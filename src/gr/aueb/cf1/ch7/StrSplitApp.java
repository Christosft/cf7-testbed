package gr.aueb.cf1.ch7;

public class StrSplitApp {

    public static void main(String[] args) {
        String s = "Athens   uni  of   econ  and   buisness";

        String[] tokens = s.split("\\s+");

        for (String token : tokens) {
            System.out.println(token + " ");
        }
    }
}
