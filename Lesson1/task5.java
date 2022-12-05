// Написать метод, которому в качестве аргументов передается строка и число, 
// метод должен отпечатать в консоль указанную строку, указанное количество раз;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String line = iScanner.nextLine();
        System.out.printf("Введите целое число: ");
        int number = iScanner.nextInt();
        iScanner.close();

        System.out.println(repeatLine(line, number));
    }

    public static String repeatLine(String line, int number) {
        String result = line;
        for (int i = 1; i < number; i++) {
            result += "\n" + line;
        }
        return result;
    }
    
}
