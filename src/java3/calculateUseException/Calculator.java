package java3.calculateUseException;

import java.util.Scanner;

// 예외 처리가 포함된 계산기 프로그램 작성하기

public class Calculator {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("첫번째 숫자 입력 : ");
            double num1 = Double.parseDouble(scanner.next());

            System.out.print("연산자(+,-,*,/)를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = Double.parseDouble(scanner.next());

            double result = cal.calculation(num1, num2, operator);
            System.out.println("결과: " + result);
        }

        catch (NumberFormatException e) {
            System.out.println("오류: 숫자를 올바르게 입력하세요.");
        } catch (ArithmeticException e) {
            System.out.println("오류: 0으로 나눌 수 없습니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("오류: 올바른 연산자를 입력하세요 (+, -, *, /).");
        } catch (Exception e) {
            System.out.println("알 수 없는 오류가 발생했습니다.");
        } finally {
            scanner.close();
        }

    }
}
