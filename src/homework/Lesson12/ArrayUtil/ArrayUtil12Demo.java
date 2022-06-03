package homework.Lesson12.ArrayUtil;

public class ArrayUtil12Demo {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 32, 23, 2, 1};
        ArrayUtil12 au = new ArrayUtil12();

        System.out.println("max-ը հավասար է " +au.max(numbers)); // Ամենամեծը


        System.out.println("max-ը հավասար է " +au.min(numbers)); // Ամենափոքրը


        au.print(numbers);
        System.out.println(); // բոլոր էլեմենտները


        au.printOdd(numbers); // կենտերը
        System.out.println();


        au.printEven(numbers); // զույգերը
        System.out.println();

    }
}
