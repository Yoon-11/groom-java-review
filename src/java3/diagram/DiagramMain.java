package java3.diagram;

public class DiagramMain {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        Rectangle rectangle = new Rectangle(10,20);
        Triangle triangle = new Triangle(30,30);

        circle.extent();
        rectangle.extent();
        triangle.extent();
    }
}
