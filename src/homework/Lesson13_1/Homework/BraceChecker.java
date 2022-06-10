package homework.Lesson13_1.Homework;

public class BraceChecker {

    private String text;
    StackMy temp = new StackMy();
    private int indexOpen;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        char[] textChar = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            String s = "Error: opened " + textChar[i] + " but closed " + textChar[i] + " at " + i;
            switch (textChar[i]) {
                case '(':
                case '{':
                case '[':
                    temp.push(textChar[i]);
                    break;
                case ')':
                    if (temp.pop() != '(') {
                        System.out.println(s);
                        temp.pop();
                    }
                    break;
                case '}':
                    if (temp.pop() != '{') {
                        System.out.println(s);
                        temp.pop();
                    }
                    break;
                case ']':
                    if (temp.pop() != '[') {
                        System.out.println(s);
                        temp.pop();
                    }
                    break;
            }
        }

    }


}



