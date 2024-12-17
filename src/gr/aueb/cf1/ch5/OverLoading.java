package gr.aueb.cf1.ch5;

public class OverLoading {

    public static void main(String[] args) {

    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, long b) {
        return a + (int) b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
