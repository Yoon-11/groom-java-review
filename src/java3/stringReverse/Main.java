package java3.stringReverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String string = sc.nextLine();
        sc.close();

        byte[] sentence = string.getBytes();
        for (int i = 0; i < sentence.length / 2; i++) {
            byte temp = sentence[i];
            sentence[i] = sentence[sentence.length - 1 - i];
            sentence[sentence.length - 1 - i] = temp;
        }

        StringBuilder result = new StringBuilder();
        for (char ch : string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }else {
                result.append(ch);
            }
        }

        System.out.println("뒤집은 문자열 : " + new String(sentence));
        System.out.println("대소문자 변환 : " + result);




/*  방법 2 : StringBuilder 사용
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("뒤집힌 문자열: " + reversed);
        scanner.close();
*/
    }

    }
