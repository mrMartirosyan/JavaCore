package homework.Lesson12;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework demo1 = new PracticeHomework();

        System.out.println(demo1.convert(3));

        int days = demo1.calcDays(2);
        System.out.println(days);


        System.out.println(demo1.nextNumber(9));

        boolean equal = demo1.isTrue(7, 3);
        if (equal) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        boolean b = demo1.isUnderOrEqualZero(-2);
        if (b) {
            System.out.println("0 or less than zero");
        } else {
            System.out.println("more than zero");
        }


        System.out.println(demo1.reverseBool(true));

        int[] arr1 = new int[10];
        int[] arr2 = new int[20];
        System.out.println(demo1.maxLength(arr1, arr2));


    }
}
