package homeWork3.gb;

import java.util.ArrayList;
import java.util.List;

/*
Дан массив целых чисел (List<Integer>) найти минимальное, максимальное значения в этом массиве.
 */
public class MinMaxInList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> secondNuns = List.of(2, 1, 4, 5, 6, -2);
        nums.add(2);
        nums.add(1);
        nums.add(8);
        nums.add(3);
        nums.add(-7);
        System.out.println("Первый список: " + nums);
        System.out.println("Второй список: " + secondNuns);

        System.out.println(maxValue(nums));
        System.out.println(minValue(secondNuns));
    }

    private static int maxValue(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            max = Math.max(num, max);
        }
        return max;
    }

    private static int minValue(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            min = Math.min(num, min);
        }
        return min;
    }
}
