// Написать метод, которому в качестве параметра передается целое число. 
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите целое число: ");
        int number = iScanner.nextInt();
        iScanner.close();

        boolean result = checkValue(number);
        System.out.println(result);
    }

    public static boolean checkValue(int number) {
        if (number < 0) return true;
        else return false;
    }
    
}


