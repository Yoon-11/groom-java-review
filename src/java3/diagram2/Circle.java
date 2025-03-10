package java3.diagram2;

public class Circle extends AbArea{
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius, 2) * PI;
    }
}
