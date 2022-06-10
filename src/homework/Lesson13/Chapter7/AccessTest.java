package homework.Lesson13.Chapter7;

public class AccessTest {
    public static void main(String[] args) {
        Test2 ob = new Test2();
        ob.a = 10;
        ob.b = 20;
//        ob.c = 5; // private

        ob.setc(5);

        System.out.println(ob.a + " " + ob.b + " " + ob.getc());
    }
}
