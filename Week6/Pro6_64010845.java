package Week6;

import java.util.Date;
import java.util.Scanner;

public class Pro6_64010845 {
    public static void main(String[] args) {
        boolean state = true;
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }
        Scanner input = new Scanner(System.in);
        int id = 0;
        while (state) {
            while (state) {
                System.out.print("Enter an id: ");
                id = input.nextInt();
                if (id >= 0 && id <= 9) {
                    break;
                }
            }
            while (state) {
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts[id].getBalance());
                        System.out.println("");
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw:");
                        double withdraw = input.nextDouble();
                        if (accounts[id].getBalance() < withdraw || withdraw < 0) {
                            System.out.println("Can't withdraw");
                        } else {
                            accounts[id].withdraw(withdraw);
                            System.out.println("");
                        }
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit:");
                        double deposit = input.nextDouble();
                        if (deposit < 0) {
                            System.out.println("Can't deposit");
                        } else {
                            accounts[id].deposit(deposit);
                            System.out.println("");
                        }
                        break;
                    case 4:
                        System.out.println("End of Program.");
                        state = false;
                        break;
                    default:
                        break;
                }
            }
        }
        input.close();
    }

}

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

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