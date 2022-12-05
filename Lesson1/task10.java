// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами 
// (можно только одну из диагоналей, если обе сложно). 
// Определить элементы одной из диагоналей можно по следующему принципу: 
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

public class task10 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j)  {
                    arr[i][j] = 1;
                } else if (j == arr[i].length-1 - i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }
}
