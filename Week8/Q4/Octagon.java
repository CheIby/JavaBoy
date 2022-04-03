package Week8.Q4;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
    private double side;

    public Octagon() {

    }

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return (2 + (4 / 22)) * this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Area: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
