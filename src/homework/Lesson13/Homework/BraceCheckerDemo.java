package homework.Lesson13.Homework;

public class BraceCheckerDemo {
    public static void main(String[] args) {

        String text = "Hello {Java)";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();

    }
}
