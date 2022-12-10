package lesson1;

public class TaskFive {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                ++start;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                --end;
            }

            if (start < end) {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                    System.out.println("Not a palindrome");
                    return false;
                }
                ++start;
                --end;
            }

        }
        System.out.println("Palindrome");
        return true;
    }
}

