package java3.rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        CircumferenceAndArea c = new CircumferenceAndArea();

        System.out.println(c.calculateArea(5, 6.5));
        System.out.println(c.calculateCircum(10,20));
    }
}
