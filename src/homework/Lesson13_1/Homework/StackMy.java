package homework.Lesson13_1.Homework;

public class StackMy {
    private char[] stck = new char[10];
    private int tos;

    public StackMy() {
        tos = -1;
    }

    public void push(char item) {
        if (tos == 9) {
            System.out.println("Stack is full.");
        } else {
            stck[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty.");
            return 0;
        } else {
            return stck[tos--];
        }
    }

    public boolean isEmpty() {
        if (tos < 0) {
            return true;
        } else {
            return false;
        }
    }
}
