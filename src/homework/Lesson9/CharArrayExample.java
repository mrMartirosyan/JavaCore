package homework.Lesson9;

//1) Ունենք հետևյալ մասիվը՝
//char[] chars = {'j','a','v','a','l,'o','v', 'e'};
//ունենք նաև մի սինվոլ՝ char c = 'o';
//Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
//2) Ունենք հետևյալ մասիվը՝
//char[] chars2 = {'j','a','v','a','l,'o','v', 'e'};
//պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
//3) Ունենք հետևյալ մասիվը՝՝
//char[] chars3 = {'j','a','v','a','l,'o','l', 'y'};
//պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ fals

public class CharArrayExample {
    public static void main(String[] args) {

        char[] chars2 = {'j','a','v','a', 'l', 'o', 'v', 'e'};
        System.out.println((chars2.length/2 -1) + " " + chars2.length/2 +1);
    }
}


//    Առաջադրանք N2:
//    char[] chars2 = {'j','a','v','a', 'l', 'o', 'v', 'e'};
//        System.out.println((chars2.length/2 -1) + " " + chars2.length/2 +1);


//    Առաջադրանք N1:
//
//    char [] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
//        char c = 'o';
//        int quantity = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if (c == chars[i]) {
//                quantity++;
//            }
//        }
//        System.out.println("the quantity of 'o'-es in array is " +quantity);