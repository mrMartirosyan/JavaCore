package homework.Lesson9;

public class CharArrayExample {
    public static void main(String[] args) {


        System.out.println("Առաջադրանք N5:");

        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        char absent = ' ';
        for (int i = 0; i < text.length; i++) {
            if (absent!= text[i]){
                System.out.print(text[i] + "  ");
            }
        }
        System.out.println();
        System.out.println();



        System.out.println("Առաջադրանք N4:");
        System.out.println("չունեմ ելքային տեքստ, որում ստուգեմ, բայց՝");
        System.out.println("եթե պետք է ստուգեմ անմիջապես մասիվի դարակները՝");

        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean isbob = true;
        char bobsb = 'b';
        for (int i = 0; i < bobArray.length; i++) {
            if (bobsb == bobArray[i]) {
                if (bobsb != bobArray[i+1]) {
                    if (bobsb == bobArray[i+2])
                        System.out.println(isbob);
                }
            }
        }
        System.out.println();
        System.out.println();



        System.out.println("Առաջադրանք N3:");

    char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        char a = 'l';
        char b = 'y';

        if (a == chars3[chars3.length - 2]) {
            if (b == chars3[chars3.length-1]) {
                System.out.println("true");
            }
            else
                System.out.println("false");
        }
        System.out.println();
        System.out.println();



        System.out.println("Առաջադրանք N2:");

        char[] chars2 = {'j','a','v','a', 'l', 'o', 'v', 'e'};
        System.out.println((chars2[chars2.length/2-1]) + " " + chars2[chars2.length/2]);


        System.out.println();
        System.out.println();


        System.out.println("Առաջադրանք N1:");

    char [] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int quantity = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                quantity++;
            }
        }
        System.out.println("the quantity of 'o'-es in array is " +quantity);
}}