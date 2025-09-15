package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        //ex 1
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println("-------------");
        //ex 2
        System.out.println(numbers[0]);

        System.out.println("-------------");

        //ex 3
        System.out.println(numbers[numbers.length - 1]);

        //ex 4
        System.out.println("-------------");
        System.out.println(numbers.length);

        //ex 5
        System.out.println("-------------");

        int k = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (k > numbers[i]) {
                k = numbers[i];
            }
        }
        System.out.println(k);

        //ex 6
        System.out.println("-------------");


        if (2 > numbers.length) {
            System.out.println("can't print middle values");
        }
        if (2 == numbers.length) {
            System.out.println("can't print middle values");
        }
        if (2 < numbers.length) {
            if (numbers.length % 2 == 1) {
                int b = numbers.length / 2;
                System.out.println(numbers[b]);
            }
            if (numbers.length % 2 == 0) {
                int b = numbers.length / 2;
                System.out.println(numbers[b - 1]);
                System.out.println(numbers[b]);
            }
        }

        //ex 7
        System.out.println("-------------");
        int couple = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                couple++;
            }
        }
        System.out.println(couple);

        //ex 8
        System.out.println("-------------");
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                odd++;
            }
            if (numbers[i] % 2 == -1) {
                odd++;
            }
        }
        System.out.println(odd);

        //ex 9
        System.out.println("-------------");

        double result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        System.out.println(result);

        // ex 10
        System.out.println("-------------");

        System.out.println(result/ numbers.length);


    }
}
