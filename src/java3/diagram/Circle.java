package java3.diagram;

public class Circle implements ShapeInformation{
    private int radius;
    private final double PI = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void extent() {
        double result = Math.pow(radius, 2) * PI;
        System.out.println(result);
    }
}
