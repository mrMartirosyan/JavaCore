package homework.Lesson13.Chapter7;

public class Test1 {
    int a;

    Test1(int i) {
        a = i;
    }

    Test1 incrByTen() {
        Test1 temp = new Test1(a + 10);
        return temp;
    }
}
