package homework.Lesson13.Chapter7;

public class OverloadDemoTest {
    public static void main(String[] args) {
        OverloadDemo overloadDemo = new OverloadDemo();

        int i = 88;

        overloadDemo.test();
        overloadDemo.test(10, 20);

        overloadDemo.test(i);

        overloadDemo.test(123.2);




//        overloadDemo.test();
//        overloadDemo.test(4);
//        overloadDemo.test(3,'e');
//        double result =overloadDemo.test(12.5);
//        System.out.println("Результат вызова ob.test(12.5): " + result);
    }
}
