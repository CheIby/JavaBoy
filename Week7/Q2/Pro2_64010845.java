package Week7.Q2;

public class Pro2_64010845 {
    public static void main(String[] args) {
        Account account = new Account("George", 1122, 1000);
        account.setAnnualInterestRate(1.65);
        System.out.println("Name: " + account.getName());
        System.out.println("Account ID: " + account.getId());
        System.out.println("Annual interest rate: " + account.getAnnualInterestRate());
        account.deposit(30.0);
        account.deposit(40.0);
        account.deposit(50.0);
        account.withdraw(5.0);
        account.withdraw(4.0);
        account.withdraw(2.0);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Date\t\t\t\tType\tAmount\tBalance");
        for (int i = 0; i < account.getTransaction().size(); i++) {
            System.out.print(account.getTransaction().get(i).getDate() + "\t");
            System.out.print(account.getTransaction().get(i).getType() + "\t");
            System.out.print(account.getTransaction().get(i).getAmont() + "\t");
            System.out.print(account.getTransaction().get(i).getBalance() + "\t");
            System.out.println("");
        }
    }
}
