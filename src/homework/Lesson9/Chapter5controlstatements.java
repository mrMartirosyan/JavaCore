package homework.Lesson9;

public class Chapter5controlstatements {
    public static void main(String[] args) {

        int month = 4;
        String season;
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Bogus month";
        }
        System.out.println("April is in the " + season + ".");

//        for (int i = 0; i < 12; i++) {
//            switch (i){
//                case 0:
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                    System.out.println("i less then 5");
//                    break;
//                case 5:
//                case 6:
//                case 7:
//                case 8:
//                case 9:
//                    System.out.println("i less then 10");
//                    break;
//                case 10:
//                    System.out.println("i = 10");
//                    break;
//                default:
//                    System.out.println("i greater then 10");
//            }
//
//        }


//        // A simple example of switch
//        for (int i = 0; i < 6; i++) {
//            switch (i) {
//                case 0:
//                    System.out.println("if i = " + i + "  => i is zero");
//                    break;
//                case 1:
//                    System.out.println("if i = " + i + "  => i is one");
//                    break;
//                case 2:
//                    System.out.println("if i = " + i + "  => i is two");
//                    break;
//                case 3:
//                    System.out.println("if i = " + i + "  => i is three");
//                    break;
//                default:
//                    System.out.println("i is greater than 3.");
//            }
//        }


//        int month = 4; // April
//        String season;
//        if (month == 12 || month == 1 || month == 2)
//            season = "Winter";
//        else if (month ==3 || month == 4 || month == 5)
//            season = "Spring";
//        else if (month == 6 || month == 7 || month == 8)
//            season = "Summer";
//        else if (month == 9 || month == 10 || month == 11)
//            season = "Autumn";
//        else
//            season="Bugus month";
//        System.out.println("April is in the " +season + ".");


//        if (i == 10) {
//            if (j > 20) a = b;
//            if (k == 3) b = c; // this if is
//            else a = c; //associated with this else
//        } else a = d; // this else refers to  if(i==10)


//        int a = 5, b = 7;
//        boolean c = a < b;
//        if (c) a = 0;
//        else b = 0;
//        System.out.println(a + " + " + b);
    }
}
