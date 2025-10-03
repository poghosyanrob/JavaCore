package homework.dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size < array.length) {
            array[size++] = value;
        } else {
            extend(value);
        }
    }

    private void extend(int value){
        int [] copyArray = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        array = new int[array.length + 10];
        for (int i = 0; i < copyArray.length; i++) {
            array[i] = copyArray[i];
        }
        add(value);
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



