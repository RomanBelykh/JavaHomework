// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.*;
public class program{
    public static void main(String[] args) {

        List<Integer> list = new  ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i=0;i<list.size();i++){
            int chet = list.get(i)%2;
            if (chet == 0){
               list.remove(i);
            }
        }
        System.out.println(list); 
    }
}

// 2.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.* sum / count

import java.util.*;
public class program{
    public static void main(String[] args) {

        List<Integer> list = new  ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(5);
        int max = list.get(0);
        for (int i=0;i<list.size();i++){
            int current = list.get(i);
            if (current > max){
                max = current;
            }
        }
    System.out.println(max);
        
        int min = list.get(0);
        for (int i=0;i<list.size();i++){
            int current = list.get(i);
            if (current < min){
                min = current;
            }
        }
    System.out.println(min);
        
        int sum = 0;
        int count = list.size();
        for (int i=0;i<list.size();i++){
            int current = list.get(i);
            sum+=current;
            }
    float average = (float)sum/count;
    System.out.println(sum);
    System.out.println(count);
    System.out.println(average);
    }   
}
