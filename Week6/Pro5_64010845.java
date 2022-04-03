package Week6;

import java.util.Scanner;

public class Pro5_64010845 {
    public static void main(String[] args) {
        Tax tax = new Tax();
        Scanner input = new Scanner(System.in);
        System.out.println("Filing Status");
        System.out.println("[0]-Single filer");
        System.out.println("[1]-Married jointly or qualifying widow(er)");
        System.out.println("[2]-Married separately");
        System.out.println("[3]-Head of household");
        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        input.close();
        tax.setFilingStatus(status);
        tax.setTaxableIncome(income);
        System.out.print("Tax is " + tax.getTax());
    }
}

class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] bracket;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
        this.bracket = new int[][] { { 8350, 33950, 82250, 171550, 372950 },
                { 16700, 67900, 137050, 20885, 372950 },
                { 8350, 33950, 68525, 104425, 186475 },
                { 11950, 45500, 117450, 190200, 372950 }
        };
        this.rates = new double[] { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
    }

    public Tax(int filingStatus, int[][] bracket, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.bracket = bracket;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;
        if (taxableIncome <= bracket[filingStatus][0]) {
            tax = taxableIncome * rates[0];
        } else if (taxableIncome <= bracket[filingStatus][1]) {
            tax = bracket[filingStatus][0] * rates[0] + (taxableIncome - bracket[filingStatus][0]) * rates[1];
        } else if (taxableIncome <= bracket[filingStatus][2]) {
            tax = bracket[filingStatus][0] * rates[0] + (bracket[filingStatus][1] - bracket[filingStatus][0]) * rates[1]
                    + (taxableIncome - bracket[filingStatus][1]) * rates[2];
        } else if (taxableIncome <= bracket[filingStatus][3]) {
            tax = bracket[filingStatus][0] * rates[0] + (bracket[filingStatus][1] - bracket[filingStatus][0]) * rates[1]
                    + (bracket[filingStatus][2] - bracket[filingStatus][1]) * rates[2]
                    + (taxableIncome - bracket[filingStatus][2]) * rates[3];
        } else if (taxableIncome <= bracket[filingStatus][4]) {
            tax = bracket[filingStatus][0] * rates[0] + (bracket[filingStatus][1] - bracket[filingStatus][0]) * rates[1]
                    + (bracket[filingStatus][2] - bracket[filingStatus][1]) * rates[2]
                    + (bracket[filingStatus][3] - bracket[filingStatus][2]) * rates[3]
                    + (taxableIncome - bracket[filingStatus][3]) * rates[4];
        } else {
            tax = bracket[filingStatus][0] * rates[0] + (bracket[filingStatus][1] - bracket[filingStatus][0]) * rates[1]
                    + (bracket[filingStatus][2] - bracket[filingStatus][1]) * rates[2]
                    + (bracket[filingStatus][3] - bracket[filingStatus][2]) * rates[3]
                    + (bracket[filingStatus][4] - bracket[filingStatus][3]) * rates[4]
                    + (taxableIncome - bracket[filingStatus][4]) * rates[5];
        }
        return tax;
    }

    public void setFilingStatus(int status) {
        this.filingStatus = status;
    }

    public void setTaxableIncome(Double income) {
        this.taxableIncome = income;
    }

    public void setBracket(int[][] bracket) {
        this.bracket = bracket;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public double getTaxableIncome() {
        return this.taxableIncome;
    }

    public int[][] getBracket() {
        return this.bracket;
    }

    public double[] getRates() {
        return this.rates;
    }
}