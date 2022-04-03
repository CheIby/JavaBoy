package Week7.Q2;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        dateCreated = new Date();
        this.transactions = new ArrayList<Transaction>();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        this.transactions = new ArrayList<Transaction>();
    }

    public void withdraw(Double withdraw) {
        if (this.balance - withdraw < 0) {
            System.out.println("Can't withdraw");
        } else {
            this.balance -= withdraw;
            this.transactions.add(new Transaction('W', withdraw, balance, "Withdrawal from account"));
        }
    }

    public void deposit(Double deposit) {
        this.balance += deposit;
        this.transactions.add(new Transaction('D', deposit, balance, "deposit to account"));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / (12 * 100);
    }

    public double getMonthlyInterest() {
        return this.balance * getMonthlyInterestRate();
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public Date getDate() {
        return this.dateCreated;
    }

    public ArrayList<Transaction> getTransaction() {
        return this.transactions;
    }
}
