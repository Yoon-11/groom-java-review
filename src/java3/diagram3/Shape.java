package java3.diagram3;

public abstract class Shape {
     protected String type;

    public Shape(String type) {
        this.type = type;
    }

    abstract double calculateArea();

    public void printInfo() {
        System.out.println(type + "의 면적 : " +
                calculateArea());
    }
}
