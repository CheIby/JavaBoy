package Week8.Q1;

import java.util.Scanner;

public class Pro1_64010845 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 side of Triangle");
        System.out.print("Side1: ");
        double side1 = input.nextDouble();
        System.out.print("Side2: ");
        double side2 = input.nextDouble();
        System.out.print("Side3: ");
        double side3 = input.nextDouble();
        System.out.print("Enter your Triangle color: ");
        String color = input.next();
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();
        input.close();
        Triangle triangle = new Triangle(color, filled, side1, side2, side3);
        System.out.println(triangle);
    }
}
