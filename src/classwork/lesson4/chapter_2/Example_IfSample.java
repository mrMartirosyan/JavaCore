package classwork.lesson4.chapter_2;

public class Example_IfSample {
    public static void main(String[] args) {
        int x = 90;
        int y = 20;

        if (x < y)
            System.out.println("X փոքր է y-ից");
        // ԻՖ-ի արդյունքը պետք է գրել սահմանների {} մեջ, եթե 2 և ավելի տող ունենք sout-ի
        // օրինակ ներքևում
        if (x > y) {
            System.out.println("X մեծ է y-ից");
            System.out.println("kuku");
        }
        System.out.println("IF-ից հետո");
    }
}
