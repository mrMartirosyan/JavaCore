package homework.Lesson13.Homework;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        char[] textChar = text.toCharArray();
        StackMy temp = new StackMy();
        for (int i = 0; i < text.length(); i++) {
            switch (textChar[i]) {
                case '(':
                    temp.push('(');
                    for (int j = i + 1; j < textChar.length; j++) {
                        switch (textChar[j]) {
                            case '}':
                                System.out.println("Error: opened " + textChar[i] + " but closed " + textChar[j] + " at " + j);
                                temp.pop();
                                break;
                            case ']':
                                System.out.println("Error: opened " + textChar[i] + " but closed " + textChar[j] + " at " + j);
                                temp.pop();
                                break;
                        }
                    }
                    break;
                case '{':
                    temp.push('{');
                    for (int j = i + 1; j < textChar.length; j++) {
                        switch (textChar[j]) {
                            case ')':
                                System.out.println("Error: opened " + textChar[i] + " but closed " + textChar[j] + " at " + j);
                                temp.pop();
                                break;
                            case ']':
                                System.out.println("Error: opened " + textChar[i] + " but closed " + textChar[j] + " at " + j);
                                temp.pop();
                                break;
                        }
                    }
                    break;
                case '[':
                    temp.push('[');
                    for (int j = i + 1; j < textChar.length; j++) {
                        switch (textChar[j]) {
                            case '}':
                                System.out.println("Error: opened " + textChar[i] + " but closed " + textChar[j] + " at " + j);
                                temp.pop();
                                break;
                            case ')':
                                System.out.println("Error: opened " + textChar[i] + " but closed " + textChar[j] + " at " + j);
                                temp.pop();
                                break;
                        }
                    }
                    break;
            }
        }
    }
}



