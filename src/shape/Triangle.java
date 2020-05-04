package shape;

public class Triangle extends Shape {
    private double side1 = 1.0d;
    private double side2 = 1.0d;
    private double side3 = 1.0d;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (0.5 * (side1 + side2 + side3));
    }

    public double getArea() {
        return (0.25* (Math.sqrt((side1 + side2 + side3) * (side1 + side2 - side3) * (side2 + side3 - side1) * (side3 + side1 - side2))));
//        return Math.sqrt(getPerimeter()*(getPerimeter()-side1)*(getPerimeter()-side2)*(getPerimeter()-side3));
    }

    public String toString() {
        return "A Triangle with side1 = " + side1 + ", side2 = " + side2 + " and side3 = " + side3 + ", which is subclass of " + super.toString();
    }
}
