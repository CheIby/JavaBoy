package Week1;

import java.util.Scanner;
import java.lang.Math;

public class Pro4_64010845 {
    public static void main(String[] args) {
        final double POUNDTOKIO = 0.45359237;
        final double INCHESTOMETER = 0.0254;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble() * POUNDTOKIO;
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble() * INCHESTOMETER;
        input.close();
        if (weight < 0 || height < 0) {
            System.out.print("Please Try Again");
        } else {
            double ans = weight / (Math.pow(height, 2));
            System.out.print("BMI is ");
            System.out.format("%.4f", ans);
        }
    }
}
