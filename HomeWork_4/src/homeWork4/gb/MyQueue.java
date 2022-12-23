package homeWork4.gb;

import java.util.Stack;

/*
Input
["homeWork4.gb.MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]
 */
class MyQueue {
    static Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args) {
    }


    public static void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        return s2.pop();
    }

    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        } else {
            while (!s1.isEmpty())
                s2.push(s1.pop());
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
