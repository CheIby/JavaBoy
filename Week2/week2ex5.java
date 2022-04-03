package Week2;

import java.util.Scanner;

public class week2ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num = input.nextInt();
        input.close();
        if (num >= 1 && num <= 15) {
            for (int i = 1; i <= num; i++) {
                for (int j = num - i; j > 0; j--) {
                    System.out.print("  ");
                }
                for (int k = i; k >= 1; k--) {
                    System.out.print(k + " ");
                }
                for (int m = 2; m <= i; m++) {
                    System.out.print(m + " ");
                }
                System.out.println();
            }
        } else {
            System.out.print("Please enter number between 1 to 15");
        }

    }
}
