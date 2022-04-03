package Week5;

public class Pro2_64010845 {
    public static void main(String[] args) {
        RegularPolygon rp = new RegularPolygon();
        System.out.println("Perimeter: " + rp.getPerimeter());
        System.out.println("Area: " + rp.getArea());
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        System.out.println("Perimeter: " + rp2.getPerimeter());
        System.out.println("Area: " + rp2.getArea());
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Perimeter: " + rp3.getPerimeter());
        System.out.println("Area: " + rp3.getArea());
    }
}

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public Double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        return (this.n * this.side * this.side) / (4 * Math.tan(Math.PI / this.n));
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getN() {
        return this.n;
    }

    public double getSide() {
        return this.side;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}