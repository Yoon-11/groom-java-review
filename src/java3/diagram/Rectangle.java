package java3.diagram;

public class Rectangle implements ShapeInformation{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void extent() {
        int result = width * height;
        System.out.println(result);
    }
}
