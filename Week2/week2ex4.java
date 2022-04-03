package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class week2ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list[] = { "first", "second", "third" };
        String cities[] = { "", "", "" };
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the " + list[i] + " city: ");
            String name = input.nextLine();
            cities[i] = name;
        }
        input.close();
        for (int i = 0; i < 3; i++) {
            cities[i] = cities[i].substring(0, 1).toUpperCase() + cities[i].substring(1);
        }
        Arrays.sort(cities);
        System.out
                .println("The three cities in alphabetical order are " + cities[0] + " " + cities[1] + " " + cities[2]);
    }
}
