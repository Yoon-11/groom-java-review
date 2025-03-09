package java3.lambda;

import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class InputUseLambda {

    public void inputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        double num1 = sc.nextDouble();
        System.out.print("두번째 숫자를 입력하세요 : ");
        double num2 = sc.nextDouble();
        System.out.print("연산자를 입력하세요 : ");
        char str = sc.next().charAt(0);

        Map<Character, BiFunction<Double, Double, Double>> operations = Map.of(
                '+', (a, b) -> a + b,
                '-', (a, b) -> a - b,
                '*', (a, b) -> a * b,
                '/', (a, b) -> b != 0 ? a / b : Double.NaN,
                '%', (a, b) -> a % b
        );

        double result = operations.getOrDefault(str, (a, b) -> 0.0).apply(num1, num2);
        System.out.println(num1 +" "+ str +" "+ num2 + " = " + result);

    }



}
