package lesson1;

import java.util.Scanner;

public class TaskThree {
    public static int removeElement(int[] nums, int val) {
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[point] = nums[i];
                point++;
            }
        }
        return point;
    }
}
