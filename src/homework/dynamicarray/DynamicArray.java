package homework.dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];
    private int [] copyArray;
    private int size = 0;

    public void add(int value) {

        if (size < array.length) {
            array[size++] = value;
        } else {
            copyArray = new int [array.length];
            for (int i = 0; i < array.length; i++) {
                copyArray[i] = array[i];
            }
            extend();
            array[size++] = value;
        }
    }

    private void extend(){
        array = new int[array.length + 10];
        for (int i = 0; i < copyArray.length; i++) {
            array[i] = copyArray[i];
        }
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int getByIndex(int index) {
        for (int i = 0; i < size; i++) {
            if(index == i){
                return array[i];
            }
        }
        return -1;
    }
}



