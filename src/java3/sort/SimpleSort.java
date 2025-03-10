package java3.sort;

import java.util.Arrays;
import java.util.Scanner;

// 배열을 사용하여 간단한 정렬 알고리즘 구현하기

public class SimpleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("만들고자하는 배열 크기 입력 : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println(size + "개의 정수 입력!");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        SimpleSorted simpleSorted = new SimpleSorted();
        int[] sorted = simpleSorted.sorted(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
