package homework.dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];
    private int[] longArray = new int[array.length + 10];
    private int saze = 0;

    private void extend(int value) {
        if (saze < longArray.length) {
            for (int i = 0; i < array.length; i++) {
                longArray[i] = array[i];
            }
            longArray[saze++] = value;
        } else {
            System.out.println("input 1-20 elements ");
        }

    }


    public void add(int value) {
        if (saze < array.length) {
            array[saze++] = value;
        } else {
            extend(value);
        }
    }


    public void print() {
        if (saze > array.length) {
            for (int i = 0; i < saze; i++) {
                System.out.print(longArray[i] + " ");
            }
        } else {
            for (int i = 0; i < saze; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public int getByIndex(int index) {
        if (index < saze) {
            if (saze <= array.length) {
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



