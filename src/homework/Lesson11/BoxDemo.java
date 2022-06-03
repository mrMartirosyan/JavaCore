package homework.Lesson11;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 30);


        Box myBox3 = new Box(4, 5, 3);


        double vol = myBox3.vol();
        System.out.println(vol);

        double vol1 = myBox1.vol();

//        vol = myBox1.depth* myBox1.height* myBox1.width;
//        System.out.println("Ծավալը հավասար է " + vol);

//
        System.out.println(myBox1.vol());
//
//        System.out.println(myBox1.square(25));
//
//        int x, y, z;
//        x = myBox1.square(3);
//        y = myBox1.square(4);
//        z = 2;
//        int b = myBox1.square(z);
//        System.out.println(x + " " + y + " " + b);


    }
}
