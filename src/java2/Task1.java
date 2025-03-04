package java2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        average(list);
        int[] changeValueArray = changeValue(list, 2, 99);
        System.out.println(Arrays.toString(changeValueArray));
    }

    public static void average(int[] array) {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        int average = sum / array.length;
        System.out.println(average);
    }

    public static int[] changeValue(int[] array, int location, int value) {
        array[location] = value;
        return array;
    }
}
