package homework.Lesson13.Chapter6;

public class TestStack {
    public static void main(String[] args) {

        //В этом классе организуются два целочисленных стека, в каждом
        //из которых сначала размещаются, а затем извлекаются некоторые значения.
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        //извлечь эти числа из стека
        System.out.println("Содержимое стека myStack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Содержимое стека myStack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
