package Week2;

import java.util.Scanner;

public class week2ex3 {
    public static void main(String[] args) {
        int day, month, year;
        Scanner input = new Scanner(System.in);
        System.out.print("Day: ");
        day = input.nextInt();
        System.out.print("Month: ");
        month = input.nextInt();
        System.out.print("Year: ");
        year = input.nextInt();
        input.close();

        if (month > 12 || month < 1) {
            System.out.print("Don't have this month");
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day <= 31 && day > 0 && year > 0) {
                dayweekyear(day, month, year);
            } else {
                System.out.print("Don't have this Day");
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day <= 30 && day >= 1 && day > 0) {
                dayweekyear(day, month, year);
            } else {
                System.out.print("Don't have this Day");
            }
        }
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if (day <= 29 && day >= 1 && year > 0) {
                    dayweekyear(day, month, year);
                } else {
                    System.out.print("Don't have this Day");
                }
            } else {
                if (day <= 28 && day >= 1 && year > 0) {
                    dayweekyear(day, month, year);
                } else {
                    System.out.print("Don't have this Day");
                }
            }
        }

    }

    private static void dayweekyear(int x, int y, int z) {
        if (y == 1) {
            y = 13;
            z--;
        }
        if (y == 2) {
            y = 14;
            z--;
        }
        int q = x;
        int m = y;
        int k = z % 100;
        int j = z / 100;
        int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;
        switch (h) {
            case 0:
                System.out.print("Saturday");
                break;
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
        }
    }
}
