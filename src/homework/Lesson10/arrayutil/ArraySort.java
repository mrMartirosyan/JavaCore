package homework.Lesson10.arrayutil;

public class ArraySort {
    public static void main(String[] args) {

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int duty;


        // Խնդիր 1.  Աճման կարգով

        for (int x = 0; x < numbers.length * numbers.length; x++) {

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < i + 2 || j < numbers.length; j += i) {

                    if (numbers[i] < numbers[j]) {
                        break;
                    }
                    if (numbers[i] > numbers[j]) {
                        duty = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = duty;
                    }
                }
            }
        }
        System.out.println("1.1 Աճման կարգով`");
        for (int z = 0; z < numbers.length; z++) {
            System.out.print(numbers[z] + " ");
        }




        //  Խնդիր 1.  Նվազման կարգով

        for (int x = 0; x < numbers.length * numbers.length; x++) {

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < i + 2 || j < numbers.length; j += i) {

                    if (numbers[i] > numbers[j]) {
                        break;
                    }
                    if (numbers[i] < numbers[j]) {
                        duty = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = duty;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("1. Նվազման կարգով`");
        for (int z = 0; z < numbers.length; z++) {
            System.out.print(numbers[z] + " ");

        }
        System.out.println();
    }
}
