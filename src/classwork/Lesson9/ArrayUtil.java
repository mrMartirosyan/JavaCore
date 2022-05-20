package classwork.Lesson9;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {34, 22, 56, 7, 9, 1, 34, 0, 2, -6};
        // tpel elementnery
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        // gtnel amenamecy ?????????

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("max-y = e " +max);
        // заебался 5 часов в целом, а было так легко!
    }
}
