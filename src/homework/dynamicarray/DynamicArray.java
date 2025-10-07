package homework.dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] copyArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        array = copyArray;
    }

    public void deleteByIndex(int index) {
        if (-1 < index && index <= size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            --size;
        } else {
            System.out.println("index:" + index + "  element doesn't exist");
        }
    }


    public void set(int index, int value) {
        if (index > -1 && index < size) {
            array[index] = value;
        } else {
            System.out.println("index:" + index + "  element doesn't exist");
        }
    }

    public void add(int index, int value) {
        if (index > -1 && index < size) {
            ++size;
            int num = array[index];
            array[index] = value;
            for (int i = size; i > index ; i--) {
                array[i] =  array[i - 1];
            }
            array[index + 1] = num;
        } else {
            System.out.println("index:" + index + "  element doesn't exist");
        }
    }

    public boolean exists(int value) {
        for (int num : array){
            if(num == value){
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int getByIndex(int index) {
        for (int i = 0; i < size; i++) {
            if (index == i) {
                return array[i];
            }
        }
        return -1;
    }
}



