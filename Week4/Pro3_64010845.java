package Week4;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Random;

public class Pro3_64010845 {
    static boolean Isprime(long n) {
        long num = n;
        long i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    static boolean Palindromic(long x) {
        long ans = 0;
        long num = x;
        while (num > 0) {
            ans *= 10;
            ans += num % 10;
            num /= 10;
        }
        if (ans == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Stopwatch time = new Stopwatch();
        Random randNum = new Random();
        double[] arr;
        arr = new double[1001];
        long number = 2;
        long count = 1;
        time.start();
        System.out.println("Creating a list containing 1000 elements,");
        for (int i = 1; i <= 1000; i++) {
            Double a = randNum.nextDouble(999);
            arr[i] = a;
            System.out.printf("%8.2f ", a);
            if (i % 5 == 0) {
                System.out.println("");
            }
        }
        System.out.println("List created");
        System.out.println("Sorting stopwatch starts...");
        Arrays.sort(arr);
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%8.2f ", arr[i]);
            if (i % 5 == 0) {
                System.out.println("");
            }
        }
        time.stop();
        System.out.println("Sorting stopwatch stoped.");
        System.out.printf("The sort time is %.1f milliseconds", time.getElapsedTime());
        System.out.println("------------------------------------------------------------");
        time.start();
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        while (count <= 100) {
            if (Isprime(number) && Palindromic(number)) {
                System.out.printf("%8d", number);
                System.out.print(" ");
                if (count % 10 == 0) {
                    System.out.println("");
                }
                count++;
            }
            number++;
        }
        time.stop();
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.printf("The palindromPrime time is %.1f milliseconds", time.getElapsedTime());
    }
}

class Stopwatch {
    private double startTime;
    private double endTime;
    GregorianCalendar timeCount = new GregorianCalendar();

    public void start() {
        GregorianCalendar timeCount = new GregorianCalendar();
        startTime = timeCount.getTimeInMillis();
    }

    public void stop() {
        GregorianCalendar timeCount = new GregorianCalendar();
        endTime = timeCount.getTimeInMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
}
