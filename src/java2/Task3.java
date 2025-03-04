package java2;

public class Task3 {
    public static void main(String[] args) {
        int add = add(3, 4);
        int minus = minus(10, 6);

        System.out.println("add = " + add);
        System.out.println("minus = " + minus);

    }

    public static int add(int a,int b) {
        return a + b;
    }

    public static int minus(int a,int b) {
        return a - b;
    }

}

