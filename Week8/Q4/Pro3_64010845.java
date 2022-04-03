package Week8.Q4;

public class Pro3_64010845 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon = new Octagon(5);
        Octagon octagonClone = (Octagon) octagon.clone();
        System.out.println("Octangon\n" + octagon);
        System.out.print("Created Clone Octagon and compare clone and original\nResult: ");
        switch (octagon.compareTo(octagonClone)) {
            case 1:
                System.out.println("Not equal to");
                break;
            case 0:
                System.out.println("Two object equal to");
                break;
            case -1:
                System.out.println("Not equal to");
                break;
        }
    }
}
