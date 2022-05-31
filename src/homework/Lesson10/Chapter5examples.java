package homework.Lesson10;

public class Chapter5examples {
    public static void main(String[] args) {
        // Циклы
        // 1. for  2. while  3. do-wile

//        int month = 4;
//        String season = null;
//        int n = 10;
//        while (n >0) {
//            System.out.println("tact " +n);
//            n--;
//        }
//        int i, j;
//        i =100;
//        j = 200;
//        while (++i < --j){
//            System.out.println(i);
//        }
//        System.out.println(" mijiny = " +i);


//        int n = 10;
//        do {
//            System.out.println("Tact " +n);
//            n--;
//        }while (n>0);

//        int n = 10;
//        do {
//            System.out.println("Tact " + n);
//        }while (--n>0);

//        Scanner {
//            char choice;
//            do {
//                System.out.println("Справка по оператору: ");
//                System.out.println("           1. if");
//                System.out.println("           2. switch");
//                System.out.println("           3. .....");
//                System.out.println("           4. .....");
//                System.out.println("           5. .....");
//                System.out.println("Выберите нужный пункт: ");
//                choice = (char) System.in.read();
//
//            } while (choice < '1' || choice > '5');


//        int n;
//        for (n = 10; n > 0; n--) {
//            System.out.println("Tact " + n);
//
//        }
//
//        int num;
//        boolean isPrime;
//        num = 4;
//        if (num < 2) {
//            isPrime = false;
//        } else isPrime = true;
//        for (int i = 2; i <= num / i; i++) {
//            if ((num % i) == 0) {
//                isPrime = false;
//                break;
//            }
//
//        }
//        if (isPrime) {
//            System.out.println("Простое число");
//        }else System.out.println("Не простое число");
//
//    }

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int duty;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    duty = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = duty;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}



