package homework.Lesson13.Chapter7;

public class OverloadDemo {

    void test() {
        System.out.println("Параметры отсутствуют.");
    }

    void test(int a, int b) {
        System.out.println("a & b: " + a + " & " + b);
    }
    void test (double a){
        System.out.println("Bнyтpeннee преобразование при вызова test(douЬle) а: " + a);
    }




//    void test() {
//        System.out.println("Параметры оссутствуют");
//    }
//
//    void test(int a) {
//        System.out.println("a: " + a);
//    }
//
//    void test(int a, char b) {
//        System.out.println("a and b: " + a + " and " + b);
//    }
//
//    double test(double a) {
//        System.out.println("double a = " + a);
//        return a * a;
//    }


}
