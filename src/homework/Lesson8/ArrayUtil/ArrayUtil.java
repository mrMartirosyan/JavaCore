package homework.Lesson8.ArrayUtil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {5, 15, 7, 44, 2, 16, 37, 24, 63, 11};

        // 5. Տպեք մասիվի բոլոր կենտ էլեմենտները
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }


//        // 4. Տպեք մասիվի բոլոր զույգ էլեմենտները
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] %2 ==0){
//                System.out.print(array[i] + " ");
//            }
//        }


        // 2. Տպեք մասիվի ամենամեծ թիվը
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println("Ամենամեծ թիվն է " + max);
    }
}


//        2.2 փորձ
//
//        int[] array = {5, 15, 7, 44, 2, 16, 37, 24, 63, 11};
//        for (int i = 0; i < 1; i++) {
//            for (int j = 1; j < 10; j++) {
//                if (array[i] < array[j]) {
//                    array[i] = array[j];
//                }
//            }
//            System.out.println("Մասսիվի ամենամեծ թիվն է  " + array[i] +
//                    "-ը " + "((( պարզվեց մասսիվի արժեքները պետք չի փոխել");
//        }
//        System.out.println(array[0] + " որտև էս տողին 63-ի փոխարեն պտի էղներ 5 ");
//    }
//}


// 2.1 փորձ
// Տպեք մասիվի ամենամեծ թիվը
//
//    Մի քիչ գուգլ արեցի՝
//
//    сначала присвойте результирующей переменной значение первого
//    числа множества. Затем последовательно перебирайте числа множества, сравнивая
//    их с результирующей переменной. Если это число больше, то присваивайте его значение
//    результирующей переменной.
//    ԱՅՍՔԱՆԸ ԲԱՎԱՐԱՐ ՀՈՒՇՈՒՄ էր - Մնացածը ինքնուրույն եմ արել:
//    Подробнее: https://www.kakprosto.ru/kak-44515-kak-nayti-naibolshee-iz-chisel#ixzz7TNc67aCu

//        int[] array = {5, 15, 7, 44, 2, 16, 37, 24, 63, 11};
//        for (int i = 0; i < 1; i++) {
//            for (int j = 1; j < 10; j++) {
//                if (array[i] < array[j]) {
//                    array[i] = array[j];
//                }
//            }
//            System.out.println("Մասսիվի ամենամեծ թիվն է  " + array[i] + "-ը )))");
//        }
//    }
//}


// 2.0 փորձ
// Տպեք մասիվի ամենամեծ թիվը

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




