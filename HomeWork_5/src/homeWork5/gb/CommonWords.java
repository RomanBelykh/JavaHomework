package homeWork5.gb;

import java.util.HashMap;
import java.util.Map;

/*
Учитывая два строковых массива words1 и words2,
верните количество строк, которые появляются ровно один раз в каждом из двух массивов.
Input:
words1 = ["leetcode","is","amazing","as","is"],
words2 = ["amazing","leetcode","is"]
Output: 2
 */
public class CommonWords {
    public static void main(String[] args) {

        String[] words1 = {"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = {"amazing", "leetcode", "is"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        int ans = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String word1 : words1) {
            map.put(word1, map.getOrDefault(word1, 0) + 1);
        }
        for (String word2 : words2) {
            if (!map.containsKey(word2)) continue;
            int count = map.get(word2);
            if (count < 2) {
                map.put(word2, count - 1);
            }
        }
        for (String word : map.keySet()) {
            if (map.get(word) == 0) ans++;
        }
        return ans;
    }
}
