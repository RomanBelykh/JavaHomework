package homeWork3.gb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
Дан массив целых чисел (List<Integer) удалить из него целые числа.
Посмотрите на метод removeAll (можно сохранить все четные значения в другой список и
передать его в removeAll или используйте итератор
 */
public class ListIterator {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(2,3,7,1,1,8,5,0,2));
        Iterator<Integer> iterator = nums.iterator();
        // nums.removeIf(cur -> cur % 2 == 0);
        while (iterator.hasNext()){
            int cur = iterator.next();
            if (cur%2 ==0){
                iterator.remove();
            }
        }
        System.out.println(nums);
    }
}
