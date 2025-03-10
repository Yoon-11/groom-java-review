package java3.calculateUseException;

public class Calculate {
    public double calculation(double num1, double num2, char operator) {
        switch (operator) {
            case '+'-> {return num1 + num2;}
            case '-' -> {return num1 - num2;}
            case '*'-> {return num1 * num2;}
            case '/'->
            {if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                return num1 / num2;}

            default->
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
    }
}
