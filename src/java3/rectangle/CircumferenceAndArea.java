package java3.rectangle;

public class CircumferenceAndArea {
    private double circum;
    private double area;

    public double calculateArea(double x, double y) {
        this.area = x * y;
        return area;
    }

    public double calculateCircum(double width, double height) {
        this.circum = width * 2 + height * 2;
        return circum;
    }
}
