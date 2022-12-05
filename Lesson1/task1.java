// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int number = iScanner.nextInt();
        iScanner.close();

        int sumResult = totalSum(number);
        int multiResult = factorial(number);
        System.out.println("Сумма чисел от 1 до " + number + ": " + sumResult);
        System.out.println("Произведение чисел от 1 до " + number + ": " + multiResult);
    }

    public static int totalSum(int value) {
        int result = 0;
        for (int i = 1; i <= value; i++) {
            result += i;
        }
        return result;
    }

    public static int factorial(int value) {
        int result = 1;
		for (int i = 1; i <= value; i ++){
			result = result*i;
		}
		return result;
	}	
}
