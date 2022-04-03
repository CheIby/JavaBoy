package Week7.Q2;

import java.util.Date;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private String description;
    private Date date;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }

    public char getType() {
        return this.type;
    }

    public double getAmont() {
        return this.amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getDescription() {
        return this.description;
    }

    public Date getDate() {
        return this.date;
    }
}
