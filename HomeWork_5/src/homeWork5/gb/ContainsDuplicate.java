package homeWork5.gb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Учитывая целочисленный массив nums и целое число k,
верните значение true, если в массиве есть два различных индекса i и j,
таких что nums[i] == nums[j] и abs(i - j) <= k.
nums = [1,2,3,1], k = 3
nums = [1,2,3,1,2,3], k = 2
 */

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1}; // k = 3 true
        int[] nums1 = {1, 2, 3, 1, 2, 3}; // k = 2 false
        System.out.println(containsDuplicateSet(nums, 3));
        System.out.println(containsDuplicateMap(nums1, 2));
    }

    private static boolean containsDuplicateSet(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i]))
                return true;
        }
        return false;
    }

    private static boolean containsDuplicateMap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer cur = map.put(nums[i], i);
            if (cur != null && i - cur <= k) {
                return true;
            }
        }
        return false;
    }
}