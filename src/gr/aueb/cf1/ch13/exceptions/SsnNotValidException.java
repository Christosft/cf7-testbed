package gr.aueb.cf1.ch13.exceptions;

public class SsnNotValidException extends Exception{

    public SsnNotValidException(double ssn) {
        super("SSN " + ssn + " is not valid.");
    }
}
