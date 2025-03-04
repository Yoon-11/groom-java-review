package java2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("입력한 숫자는 '짝수'");
        }else {
            System.out.println("입력한 숫자는 '홀수'");
        }
    }
}
