package java3.diagram;

public class Triangle implements ShapeInformation{
    private int width;
    private int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void extent() {
        int result = width * height / 2;
        System.out.println(result);
    }
}
