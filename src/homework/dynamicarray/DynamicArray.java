package homework.dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];
    private int[] longArray = new int[array.length + 10];
    private int size = 0;

    public void add(int value) {
        if (size < array.length) {
            array[size++] = value;
        } else {
            extend(value);
        }
    }


    private void extend(int value) {
        if (size < longArray.length) {
            for (int i = 0; i < array.length; i++) {
                longArray[i] = array[i];
            }
            longArray[size++] = value;
        } else {
            System.out.println("input 1-20 elements ");
        }

    }

    public void print() {
        if (size > array.length) {
            for (int i = 0; i < size; i++) {
                System.out.print(longArray[i] + " ");
            }
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public int getByIndex(int index) {
        if (index < size) {
            if (size <= array.length) {
                for (int i = 0; i < array.length; i++) {
                    if (i == index) {
                        return array[i];
                    }

                }
            } else {
                for (int i = 0; i < longArray.length; i++) {
                    if (i == index) {
                        return longArray[i];
                    }
                }
            }

        }
        return -1;
    }


}



