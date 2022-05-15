package homework.Lesson8.ArrayUtil;

public class ArrayUtil {
    public static void main(String[] args) {

        // 2. Տպեք մասիվի ամենամեծ թիվը

        int[] array = {5, 15, 7, 44, 2, 16, 37, 24, 63, 11};
        for (int i = 1; i < 10; i++) {
            if (array[0] > array[i]) {
                for (int j = i; j < 10; j++) {
                    if (array[i] > array[j]) {
                        System.out.println(array[i]);
                    }

                }

                // System.out.println("Ամենամեծ թիվն է " +array[0]);
            }

        }


        // 1. Տպեք մասիվի բոլոր էլեմենտները

//        int[] array = {5, 15, 7, 44, 2, 16, 37, 24, 63, 11};
//        for (int i = 0; i < 10; i++) {
//            System.out.print(array[i] + " ");
//        }
    }


}
