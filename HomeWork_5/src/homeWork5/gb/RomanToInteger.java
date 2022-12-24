package homeWork5.gb;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MDCLXVI"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int val = 0;
        int preIndex = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (map.get(s.charAt(i)) < preIndex) {
                val = val - map.get(s.charAt(i));
            } else {
                val = val + map.get(s.charAt(i));
            }
            preIndex = map.get(s.charAt(i));
        }
        return val;
    }
}
