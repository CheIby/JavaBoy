package Week3;

public class week3ex1 {
    static boolean Isprime(int x) {
        int i = 2;
        int num = x;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    static boolean Palindromic(int x) {
        int ans = 0;
        int num = x;
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
        int number = 2;
        int count = 1;
        while (count <= 100) {
            if (Isprime(number) && Palindromic(number)) {
                System.out.print(number);
                System.out.print(" ");
                if (count % 10 == 0) {
                    System.out.println("");
                }
                count++;
            }
            number++;
        }
    }
}
