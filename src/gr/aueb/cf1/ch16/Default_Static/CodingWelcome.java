package gr.aueb.cf1.ch16.Default_Static;

public class CodingWelcome implements IWelcome{

    public static void staticMethod() {
        System.out.println("static method from CodingWelcome hides IWelcome");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in CodingWelcome");
        IWelcome.super.defaultMethod();
    }
}
