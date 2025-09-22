package homework;

public class Sort {
    public static void main(String[] args) {
        int[] array = {59, 4, 45, 2, 72, 11, 6, 7, 8};
        for(int a : array){
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int min = array[i];
                if (min > array[j]) {
                    array[i] = array[j];
                    array[j] = min;
                }
            }
        }

        for(int k : array){
            System.out.print(k + " ");
        }

    }
}
