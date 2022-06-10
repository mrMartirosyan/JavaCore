package homework.Lesson13.Chapter7;

import homework.Lesson11.Box;

public class BoxOverloadCons2 {
    public static void main(String[] args) {
        BoxChapter7 myBox = new BoxChapter7();
        BoxChapter7 myBox1 = new BoxChapter7(2.0);
        BoxChapter7 myBox2 = new BoxChapter7(3, 4, 5);
        BoxChapter7 myBox3 = new BoxChapter7(myBox2);

        double vol;

        System.out.println(vol = myBox.volume());
        System.out.println(vol = myBox1.volume());
        System.out.println(myBox2.volume());
        System.out.println(myBox3.volume());
    }
}
