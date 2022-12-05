// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
// пройти по нему циклом, и числа меньшие 6 умножить на 2;

public class task9 {
    public static void main(String[] args) {
        int[] initialArray = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(printArray(initialArray));
        int[] newArray = changeArray(initialArray);
        System.out.println(printArray(newArray));
    }

    public static int[] changeArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                newArray[i] = array[i]*2;
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
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
