package homework.Lesson13_1.Homework;

public class BraceCheckerDemo {
    public static void main(String[] args) {

        String text = "o {J(av}a)";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
