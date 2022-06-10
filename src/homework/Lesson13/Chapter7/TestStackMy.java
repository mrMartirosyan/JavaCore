package homework.Lesson13.Chapter7;

public class TestStackMy {
    public static void main(String[] args) {
        StackMy stack1 = new StackMy();
        StackMy stack2 = new StackMy();

        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            stack2.push(i);
        }

        for (int i = 0; i < 10; i++) {
            stack1.pop();
            System.out.println(stack1.pop());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(stack2.pop());
        }

    }
}
