package Week8.Q2;

public class Pro2_64010845 {
    public static void main(String[] args) {
        GeometricObject[] square = { new Square(4), new Square(6.7), new Square(8.3), new Square(("pink"), true, 2),
                new Square(2.9) };

        for (int i = 0; i < square.length; i++) {
            System.out.println("Square No." + (i + 1));
            System.out.println("Area: " + square[i].getArea());
            System.out.println("How to color: " + ((Square) square[i]).howToColor());
            System.out.println("------------------------------");
        }
    }
}
