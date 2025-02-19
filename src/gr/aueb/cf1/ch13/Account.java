package gr.aueb.cf1.ch13;


/**
 * Defines an {@link Account} class.
 *
 * @author chris
 */

public class Account {

    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account() {

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
     *Public API
     */

    /**
     * Deposits a certain amount of money.
     *
     * @param amount  the amount of money to be deposited.
     * @throws Exception if the amount is negative.
     */


    public void deposit(double amount) throws Exception{
        try {
            if (amount < 0) {
                throw  new Exception("The amount must not be negative.");
            }
            balance += amount;
            System.out.println("Amount " + amount + " Successfully deposited."); //logging
        } catch (Exception e) {
            System.err.println("Error. " + amount + " Cannot be negative");
            //e.printStackTrace();
            throw e;
        }
    }


    /**
     * Withdraws an amount of money from the {@link Account}
     * based on a valid ssn checked by {@link #isSsnValid(String)}
     *
     * @param amount the amount to be withdrawn.
     * @param ssn  the given ssn.
     * @throws Exception  if the ssn is not valid or the balance is not sufficient or
     * the amount is negative.
     */

    public void withdraw(double amount, String ssn) throws Exception{
        try {
            if (!isSsnValid(ssn)) {
                throw new Exception("Ssn " + ssn + " is not valid.");
            }

            if (amount > balance) {
                throw new Exception("insufficient balance " + balance + " for amount " + amount);
            }

            if (amount < 0) {
                throw new Exception(" The amount must not be negative.");
            }

            balance -= amount;
            System.out.println("Amount " + amount + " Successfully withdrawn"); //logging
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            //e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns the balance of the {@link Account}.
     *
     *
     * @return the Accounts balance
     */

    public double getAccountBalance() {
        return getBalance();
    }

    /**
     * Returns a string representation of the {@link Account} state.
     *
     * @return the string-based format ot the state of the {@link Account}.
     */


    public String accountToString() {
        return "(" + id + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ", " + balance + ")";
    }

    private boolean isSsnValid(String ssn) {
        System.out.println("The account balance was returned"); //logging
        return this.ssn.equals(ssn);
    }
}
