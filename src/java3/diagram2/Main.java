package java3.diagram2;

// 추상 클래스와 인터페이스를 활용한 도형 프로그램 작성하기

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        AbArea circle = new Circle(5);
        Rectangle rectangle = new Rectangle();

        // 삼각형 넓이
        triangle.setWidth(3.3);
        triangle.setHeight(6.1);
        System.out.println(triangle.area());

        // 원 넓이
        System.out.println(circle.area());

        // 사각형 넓이
        rectangle.setHeight(40);
        rectangle.setWidth(30);
        System.out.println(rectangle.area());
    }
}
