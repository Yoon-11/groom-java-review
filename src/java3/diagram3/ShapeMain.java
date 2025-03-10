package java3.diagram3;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(9, 9);
        shapes[2] = new Triangle(100, 3);

        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }
}
