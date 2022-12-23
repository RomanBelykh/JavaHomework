package homeWork4.gb;

import java.util.Stack;
/*
Input: path = "/home//foo/../hdb/./uuu"
Output: "/home/hdb/uuu"
 */
class SimplifyPath {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/home//foo/../hdb/./uuu"));
    }

    public static String simplifyPath(String path) {

        Stack<String> s = new Stack<>();
        StringBuilder resultString = new StringBuilder();
        String[] p = path.split("/");

        for (int i = 0; i < p.length; i++) {
            if (!s.isEmpty() && p[i].equals("..")) s.pop();
            else if (!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
                s.push(p[i]);
        }

        if (s.isEmpty()) return "/";
        while (!s.isEmpty()) {
            resultString.insert(0, s.pop()).insert(0, "/");
        }
        return resultString.toString();
    }
}