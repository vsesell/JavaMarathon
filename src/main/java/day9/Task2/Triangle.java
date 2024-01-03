package day9.Task2;

public class Triangle extends Figure{
    private double A;
    private double B;
    private double C;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        A = a;
        B = b;
        C = c;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }

    @Override
    public double area() {
        double halfP = (perimeter()/2);
        return Math.sqrt(halfP * (halfP - A) * (halfP - B) * (halfP - C));
    }

    @Override
    public double perimeter() {
        return A + B + C;
    }
}
