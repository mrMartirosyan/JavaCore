package homework.Lesson13.Chapter6;

public class Stack {
    //В этом классе определяется целочисленный стек, где
    // можно хранить до 10 целочисленных значений
    int[] stck = new int[10];
    int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    //разместить элемент в стеке
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full.");
        } else {
            stck[++tos] = item;
        }
    }

    //извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty.");
            return 0;
        } else {
            return stck[tos--];
        }
    }

}
