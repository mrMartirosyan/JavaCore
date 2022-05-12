package homework.Lesson_5.Chapter_3;

public class Examples {
    public static void main(String[] args) {
        byte b, c;
        b = 111;
        short s, t;

        // long - light
        long lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186_000;
        //приблизительная скорость света, миль/секунда
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль! WOW:)");


        // double - вычислить площадь круга
        double pi, r, a;
        r = 10.8;
        pi = 3.14;
        a = pi * r * r;
        System.out.println("Площадь круга равна " + a + ".");

        // char
        char ch1, ch2;
        ch1 = 100; // код символа X
        ch2 = 'Y';
        System.out.print("ch1 и ch2: ");
        System.out.println(ch1 + " " + ch2);

        char xach = 'd';
        char sev = 'e';
        System.out.println(sev + xach + " = 100+101");

        // char можно использовать как число
        char arajin = 'X';
        System.out.println(arajin);
        arajin++;
        System.out.println(arajin);


        // boolean
        boolean be;
        be = true;
        if (be) {
            System.out.println("esi kereva");
        }
        be = false;
        if (be) {
            System.out.println("esi chi ereva");
        }

        System.out.println("10>9 Равно " + (10 > 9));
    }
}
