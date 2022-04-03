package Week1;

import java.util.Scanner;

public class Pro3_64010845 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();
        input.close();
        if (num < 0 || num > 1000) {
            System.out.println("Please Try Again");
        } else {
            int ans = 0;
            while (num != 0) {
                ans += num % 10;
                num /= 10;
            }
            System.out.println("The sum of the digits is " + ans);
        }
    }
}
