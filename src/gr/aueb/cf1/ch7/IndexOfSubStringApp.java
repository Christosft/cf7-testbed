package gr.aueb.cf1.ch7;

public class IndexOfSubStringApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");  // the first index
        int positionOfSecondo = cf.indexOf("o", 2);
        int lastPositionOfo = cf.lastIndexOf("o");


        String cf2 = cf.substring(0); // all of "coding factory"
        String slice = cf.substring(1, 5);

        System.out.println(cf2);
        System.out.println(slice);
        System.out.println(positionOfo);
        System.out.println(positionOfSecondo);
        System.out.println(lastPositionOfo);
    }
}
