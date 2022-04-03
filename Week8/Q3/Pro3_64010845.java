package Week8.Q3;

public class Pro3_64010845 {
    public static void main(String[] args) {
        Rectangle[] rectangles = { new Rectangle(6, 5, "White", true),
                new Rectangle(5, 6, "Pink", true),
                new Rectangle(8, 9, "Green", true) };
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Area of Retangle No." + (i + 1) + ": " + rectangles[i].getArea());
        }
        System.out.println("Rectangle N0.1 is " + (rectangles[0].equals(rectangles[1]) ? "" : "not ") +
                "equal to Rectangle N0.2");

        System.out.println("Rectangle No.1 is " + (rectangles[1].equals(rectangles[2]) ? "" : "not ") +
                "equal to Rectangle No.3");
    }
}
