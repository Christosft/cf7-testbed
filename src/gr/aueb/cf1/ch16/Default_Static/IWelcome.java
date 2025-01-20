package gr.aueb.cf1.ch16.Default_Static;

public interface IWelcome {

    static void staticMethod() {
        System.out.println("Hello from IWelcome static method");
    }



    default void defaultMethod() {
        System.out.println("Default method from IWelcome");
    }
}
