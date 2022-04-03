package Week1;

public class Pro1_64010845 {
    public static void main(String[] args) {
        long second, birth, death, immig;
        final long start = 312032486;
        int i = 1;
        while (i < 6) {
            second = 60 * 60 * 24 * 365;
            second *= i;
            birth = second / 7;
            death = second / 13;
            immig = second / 45;
            System.out.println(start + birth + immig - death);
            i++;
        }
    }
}
