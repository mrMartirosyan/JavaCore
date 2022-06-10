package homework.Lesson13.Homework;

public class BraceCheckerDemo {
    public static void main(String[] args) {

        String text = "Hello {J(ava)";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
