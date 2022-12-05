// Задать целочисленный массив, состоящий из элементов 0 и 1. 
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
// С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class task7 {
    public static void main(String[] args) {
        int[] initialArray = {1,1,0,0,1,0,1,1,0,0};
        System.out.println("Оригинал: " + printArray(initialArray)); 

        int[] inversedArray = inverseArray(initialArray);
        System.out.println("Инверсия: " + printArray(inversedArray));
    }

    public static String printArray(int[] array) {
        String result = "{ ";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        result += "}";
        return result;
    }

    public static int[] inverseArray(int[] initialArray) {
        int[] inversedArray = new int[initialArray.length];
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] == 0) {
                inversedArray[i] = 1;
            } else {
                inversedArray[i] = 0;
            }
        }
        return inversedArray;
    }

}
