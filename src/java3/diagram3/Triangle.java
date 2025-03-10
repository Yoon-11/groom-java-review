package java3.diagram3;

public class Triangle extends Shape{
    private double width, height;

    public Triangle(double width, double height) {
        super("삼각형");
        this.width = width;
        this.height = height;
    }


    @Override
    double calculateArea() {
        return width * height * 0.5;
    }

}
