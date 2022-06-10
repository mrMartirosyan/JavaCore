package classwork.Lesson14;

public class DynamicArray {

    int[] array = new int[10];
    int size = 0;

    void add (int value){
        if (size== array.length){
            increaseArray();
        }
        array[size] = value;
        size++;
    }

    private void increaseArray() {
        int [] temp = new int[array.length+10];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=array[i];
        }
        array=temp;
    }

    void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
