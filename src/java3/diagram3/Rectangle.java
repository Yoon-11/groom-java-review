package java3.diagram3;

public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(double width, double height) {
        super("사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

}
