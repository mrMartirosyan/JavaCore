package homework.Lesson12.ArrayUtil;

public class ArrayUtil12 {

    // maximum գտնելու մեթոդ
    int max(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // minimum գտնելու մեթոդ
    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Բոլոր էլեմենտները տպելու մեթոդ
    void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Բոլոր ԿԵՆՏ էլեմենտները տպելու մեթոդ
    void printOdd (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    //Բոլոր զույգ էլեմենտները տպելու մեթոդ

    void printEven (int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                System.out.print(array[i] + " ");
            }
        }
    }


}
