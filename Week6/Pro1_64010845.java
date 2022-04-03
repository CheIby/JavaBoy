package Week6;

import java.util.Scanner;

public class Pro1_64010845 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.next();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        input.close();
        BMI bmi = new BMI(name, age, weight, height, height);
        System.out.printf("BMI: %.2f\n", bmi.getBMI());
        bmi.getInterpretation();
    }
}

class BMI {
    private final double POUNDTOKIO = 0.45359237;
    private final double INCHESTOMETER = 0.0254;
    private String name;
    private int age, state = 0;
    private double weight, feet, inches, bmi;

    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight * POUNDTOKIO;
        this.feet = feet;
        this.inches = inches * INCHESTOMETER;
        calBMI();
    }

    private void calBMI() {
        this.bmi = this.weight / Math.pow(this.inches, 2);
        if (this.bmi < 18.5) {
            this.state = 1;
        } else if (this.bmi >= 18.5 && this.bmi < 25) {
            this.state = 2;
        } else if (this.bmi >= 25 && this.bmi < 30) {
            this.state = 3;
        } else if (this.bmi >= 30) {
            this.state = 4;
        }
    }

    public double getBMI() {
        return this.bmi;
    }

    public void getInterpretation() {
        switch (this.state) {
            case 1:
                System.out.println("Underweight");
                break;
            case 2:
                System.out.println("Normal");
                break;
            case 3:
                System.out.println("Overweight");
                break;
            case 4:
                System.out.println("Obese");
                break;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getFeet() {
        return this.feet;
    }

    public double getInches() {
        return this.inches;
    }
}