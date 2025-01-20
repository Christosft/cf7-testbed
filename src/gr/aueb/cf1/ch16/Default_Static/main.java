package gr.aueb.cf1.ch16.Default_Static;

public class main {

    public static void main(String[] args) {
        IWelcome.staticMethod();
        CodingWelcome.staticMethod();

        CodingWelcome codingWelcome = new CodingWelcome();
        codingWelcome.defaultMethod();
    }
}
