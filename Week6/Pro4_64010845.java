package Week6;

import java.util.Scanner;

public class Pro4_64010845 {
    public static void main(String[] args) {
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
        System.out.print("Tax is " + ComputeTax(status, income));
    }

    public static double ComputeTax(int status, double income) {
        double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        int[][] bracket = { { 8350, 33950, 82250, 171550, 372950 },
                { 16700, 67900, 137050, 20885, 372950 },
                { 8350, 33950, 68525, 104425, 186475 },
                { 11950, 45500, 117450, 190200, 372950 }
        };
        double tax = 0;
        if (income <= bracket[status][0]) {
            tax = income * rates[0];
        } else if (income <= bracket[status][1]) {
            tax = bracket[status][0] * rates[0] + (income - bracket[status][0]) * rates[1];
        } else if (income <= bracket[status][2]) {
            tax = bracket[status][0] * rates[0] + (bracket[status][1] - bracket[status][0]) * rates[1]
                    + (income - bracket[status][1]) * rates[2];
        } else if (income <= bracket[status][3]) {
            tax = bracket[status][0] * rates[0] + (bracket[status][1] - bracket[status][0]) * rates[1]
                    + (bracket[status][2] - bracket[status][1]) * rates[2] + (income - bracket[status][2]) * rates[3];
        } else if (income <= bracket[status][4]) {
            tax = bracket[status][0] * rates[0] + (bracket[status][1] - bracket[status][0]) * rates[1]
                    + (bracket[status][2] - bracket[status][1]) * rates[2]
                    + (bracket[status][3] - bracket[status][2]) * rates[3] + (income - bracket[status][3]) * rates[4];
        } else {
            tax = bracket[status][0] * rates[0] + (bracket[status][1] - bracket[status][0]) * rates[1]
                    + (bracket[status][2] - bracket[status][1]) * rates[2]
                    + (bracket[status][3] - bracket[status][2]) * rates[3]
                    + (bracket[status][4] - bracket[status][3]) * rates[4] + (income - bracket[status][4]) * rates[5];
        }
        return tax;
    }
}
