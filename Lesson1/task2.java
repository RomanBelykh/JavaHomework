// Написать метод, принимающий на вход два целых числа и проверяющий, 
// что их сумма лежит в пределах от 10 до 20 (включительно), 
// если да – вернуть true, в противном случае – false.

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое целое число: ");
        int number1 = iScanner.nextInt();
        System.out.printf("Введите второе целое число: ");
        int number2 = iScanner.nextInt();
        iScanner.close();

        boolean result = checkSum(number1, number2);
        System.out.println(result);
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
    }
    
}
