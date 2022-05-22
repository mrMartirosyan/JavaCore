package homework.Lesson10.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char space = ' ';
        char[] result = new char[spaceArray.length];
        char resultfinder;
        int mijuk = 0;
        int l;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != space) {
                resultfinder = spaceArray[i];
                result[i - 1] = resultfinder;
                mijuk = i;
                break;
            }
        }
        for (l = mijuk + 1; l < spaceArray.length; l++) {

            if (spaceArray[l] != space) {
                resultfinder = spaceArray[l];
                result[l - 1] = resultfinder;
                mijuk = l;
            }
        }


//       for (int i = 0; i < result.length; i++) {
//           System.out.print(result[i] + " ");
//      }

    }
}
