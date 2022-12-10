package lesson1;

public class TaskFour {
    public static String reverseWords(String s) {
        StringBuilder newStr = new StringBuilder();
        int count = 0;
        StringBuilder str = new StringBuilder(s).reverse();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                for (int j = i; j >= count; j--) {
                    newStr.append(str.charAt(j));
                }
                count = i;
            }
            if (i == str.length() - 1) {
                for (int j = i; j > count; j--) {
                    newStr.append(str.charAt(j));
                }
                newStr.delete(0, 1);
            }
        }
        System.out.println(newStr.toString());
        return newStr.toString();
    }
}
