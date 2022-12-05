// Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class task12 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 0};
        System.out.println(printArray(array));

        int minElement = findMin(array);
        System.out.println("Минимальный элемент массива: " + minElement);

        int maxElement = findMax(array);
        System.out.println("Максимальный элемент массива: " + maxElement);
    }

    public static int findMin(int[] array) {
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    public static int findMax(int[] array) {
        int maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static String printArray(int[] array) {
        String result = "{ ";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        result += "}";
        return result;
    }
}
