package homework.Lesson13.Homework;

public class BraceChecker {

    private String text;
    StackMy temp = new StackMy();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        char[] textChar = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            switch (textChar[i]) {
                case '(':
                    temp.push('(');
                    for (int j = i + 1; j < textChar.length; j++) {
                        String errMass = "Error: opened " + textChar[i] + " but closed " + textChar[j] + " at " + j;
                        switch (textChar[j]) {
                            case '}':
                            case ']':
                                System.out.println(errMass);
                                temp.pop();
                                break;
                        }
                    }
                    if (!temp.isEmpty()) {
                        System.out.println("Error: opened " + textChar[i] + " but didn't closed.");
                    }
                    break;
                case '{':
                    temp.push('{');
                    for (int j = i + 1; j < textChar.length; j++) {
                        String errMass = "Error: opened " + textChar[i] + " but closed " + textChar[j] + " at " + j;
                        switch (textChar[j]) {
                            case ')':
                            case ']':
                                System.out.println(errMass);
                                temp.pop();
                                break;
                        }
                    }
                    if (!temp.isEmpty()) {
                        System.out.println("Error: opened " + textChar[i] + " but didn't closed.");
                    }
                    break;
                case '[':
                    temp.push('[');
                    for (int j = i + 1; j < textChar.length; j++) {
                        String errMass = "Error: opened " + textChar[i] + " but closed " + textChar[j] + " at " + j;
                        switch (textChar[j]) {
                            case '}':
                            case ')':
                                System.out.println(errMass);
                                temp.pop();
                                break;
                        }
                    }
                    if (!temp.isEmpty()) {
                        System.out.println("Error: opened " + textChar[i] + " but didn't closed.");
                    }
                    break;
            }
        }

    }


}



