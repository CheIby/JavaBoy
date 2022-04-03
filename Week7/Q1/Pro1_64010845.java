package Week7.Q1;

import java.util.Date;

public class Pro1_64010845 {
    public static void main(String[] args) {
        CheckingAccount check = new CheckingAccount(1, 5000);
        check.setOverdraft(5000);
        System.out.println(check.toString());
        System.out.println("Withdraw: 10000.0");
        check.withdraw(10000.00);
        System.out.println("Balance is " + check.getBalance());
        System.out.println("This account was created at " + check.getDate());
    }
}

class Account {
    protected int id;
    protected double balance;
    protected double annualInterestRate;
    protected Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public void withdraw(Double withdraw) {
        this.balance -= withdraw;
    }

    public void deposit(Double deposit) {
        this.balance += deposit;
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
}

class CheckingAccount extends Account {
    private double overdraft;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(Double withdraw) {
        if (balance + this.overdraft >= withdraw) {
            super.withdraw(withdraw);
        } else {
            System.out.println("Can't withdraw");
        }
    }

    public String toString() {
        return "Checking Account\nOverdraft Limit: " + this.overdraft + "\nBalance is " + balance;
    }

}

class SavingAccount extends Account {

    public SavingAccount(int id, int balanece) {
        super(id, balanece);
    }

    @Override
    public void withdraw(Double withdraw) {
        if (balance >= withdraw) {
            super.withdraw(withdraw);
        } else {
            System.out.println("Can't withdraw");
            ;
        }
    }

    public String toString() {
        return "Saving Account\nBalance is " + balance + "\n";
    }
}