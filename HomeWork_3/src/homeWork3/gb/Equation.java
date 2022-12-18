package homeWork3.gb;

import java.util.ArrayList;
import java.util.List;

/*
Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
 */
public class Equation {
    public static void main(String[] args) {
        String equation = "2? + ?3 = 69".replace(" ", "");
        //equation.replace(" ", "");

        char[] charArray = equation.toCharArray();

        List<Integer> signIndexes = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '?') {
                signIndexes.add(i);
            }
        }

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '+') {
                charArray[i] = '=';
            }
        }

        List<List<Integer>> variables = new Equation().combine(signIndexes.size(), charArray, signIndexes);
        if (variables.toArray().length == 0) {
            System.out.println("Больше нет решений");
        } else {
            System.out.println(variables);
        }
    }

    List<List<Integer>> ans;

    public List<List<Integer>> combine(int k, char[] charArr, List<Integer> signIndexes) {
        ans = new ArrayList<>();
        helper(new ArrayList<>(), k, charArr, signIndexes);
        return ans;
    }

    public void helper(List<Integer> comb, int k, char[] charArr, List<Integer> signIndexes) {
        if (comb.size() == k) {
            check(comb, charArr, signIndexes);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            comb.add(i);
            helper(comb, k, charArr, signIndexes);
            comb.remove(comb.size() - 1);
        }
    }

    private void check(List<Integer> comb, char[] charArray, List<Integer> signIndexes) {
        for (int i = 0; i < signIndexes.size(); i++) {
            charArray[signIndexes.get(i)] = Character.forDigit(comb.get(i), 10);
        }

        String[] equationPart = String.valueOf(charArray).split("=");
        int a = Integer.parseInt(equationPart[0]);
        int b = Integer.parseInt(equationPart[1]);
        int c = Integer.parseInt(equationPart[2]);
        if (a + b == c) {
            System.out.printf("%d + %d = %d", a, b, c);
            System.out.println();
        }
    }

}