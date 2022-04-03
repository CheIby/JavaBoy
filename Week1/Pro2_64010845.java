package Week1;

public class Pro2_64010845 {
    public static void main(String[] args) {
        // equation 1 3.4x+50.2y=44.5
        // equqtion 2 2.1x+0.55y=5.9
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * f)) / ((a * d) - (b * c));
        System.out.println("x: " + x);
        System.out.println("x: " + y);
    }
}
