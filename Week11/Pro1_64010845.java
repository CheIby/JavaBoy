package Week11;

import java.util.Scanner;

public class Pro1_64010845 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = randNum();
        System.out.print("Index: ");
        try {
            System.out.print("The corresponding element value is " + numArray[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
        input.close();
    }

    public static int[] randNum() {
        int[] randNum = new int[100];
        for (int i = 0; i < randNum.length; i++) {
            randNum[i] = (int) (Math.random() * 100) + 1;
        }
        return randNum;
    }
}