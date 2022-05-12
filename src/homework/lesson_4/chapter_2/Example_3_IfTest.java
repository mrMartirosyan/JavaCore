package homework.lesson_4.chapter_2;

public class Example_3_IfTest {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) System.out.println("x меньше y");
        x = x * 2;
        if (x == y) System.out.println("x стал ровен y");
        x = x * 2;
        if (x > y) System.out.println("x теперь больше y");
        // следующий оператор ничего не будет выводить
        if (x == y) System.out.print("ВЫ ничего не увидите)))");
    }
}
