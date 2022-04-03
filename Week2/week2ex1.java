package Week2;

import java.util.Scanner;

public class week2ex1 {
    public static void main(String[] args) {
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Scanner num = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = num.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int nextday = num.nextInt();
        num.close();
        if (today > 6) {
            System.out.print("Try again");
        } else {
            System.out.println("Today is " + days[today] + " and the future day is " + days[(today + nextday) % 7]);
        }
    }
}
