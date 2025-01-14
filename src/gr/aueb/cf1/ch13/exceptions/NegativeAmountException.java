package gr.aueb.cf1.ch13.exceptions;

public class NegativeAmountException extends Exception{

    public NegativeAmountException(double amount) {
        super("Amount " + amount + " is not sufficient.");
    }
}
