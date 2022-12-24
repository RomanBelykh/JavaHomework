package homeWork5.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Учитывая два целочисленных массива nums1 и nums2,
верните массив их пересечения.
Каждый элемент в результате должен появляться столько раз,
сколько он отображается в обоих массивах, и вы можете возвращать результат в любом порядке.
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
 */
public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i : nums1) {
            numbers.put(i, numbers.getOrDefault(i, 0) + 1);
        }
        int a = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; ++i) {
            if (numbers.containsKey(nums2[i])) {
                a = numbers.get(nums2[i]);
                if (a >= 1) {
                    list.add(nums2[i]);
                    numbers.put(nums2[i], --a);
                }
                continue;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
