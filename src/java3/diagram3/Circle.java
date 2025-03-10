package java3.diagram3;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super("원");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
