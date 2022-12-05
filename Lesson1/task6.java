// Написать метод, который определяет, является ли год високосным, 
// и возвращает boolean (високосный - true, не високосный - false). 
// Каждый 4-й год является високосным, 
// кроме каждого 100-го, при этом каждый 400-й – високосный.

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите год: ");
        int year = iScanner.nextInt();
        iScanner.close();

        boolean result = isLeapYear(year);
        System.out.println(result);
    }
    
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
          return false;
        } else if (year % 400 == 0) {
          return true;
        } else if (year % 100 == 0) {
          return false;
        } else {
          return true;
        }
      }
}
