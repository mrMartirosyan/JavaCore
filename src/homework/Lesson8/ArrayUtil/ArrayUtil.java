package homework.Lesson8.ArrayUtil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {5, 15, 7, 44, 2, 16, 37, 24, 63, 11};
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (array[i] > array[j]) {
                    for (int k = j + 1; k < 10; k++) {
                        if (array[j] > array[k]) {
                            System.out.println(array[j]);
                        }
                    }
                }
            }
        }
    }

}


// 2. Տպեք մասիվի ամենամեծ թիվը - ՉՍՏԱՑՎԱԾ 1 փորձ

//       int[] array = {5, 15, 7, 44, 2, 16, 37, 24, 63, 11};
//       for (int i = 1; i < 10; i++) {
//           if (array[0] > array[i]) {
//              for (int j = i; j < 10; j++) {
//                if (array[i] > array[j]) {
//                   System.out.println(array[i]);
//                    }
//
//                }


// 1. Տպեք մասիվի բոլոր էլեմենտները

//        int[] array = {5, 15, 7, 44, 2, 16, 37, 24, 63, 11};
//        for (int i = 0; i < 10; i++) {
//            System.out.print(array[i] + " ");
//        }




