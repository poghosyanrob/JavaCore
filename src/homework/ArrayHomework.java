package homework;

public class ArrayHomework {
    public static void main(String[] args) {
        // ex number 1
        int[] nums = {1, 2, 3, 6, 66, 54, 6, 78, 7, 6};
//        int[] nums = {1, 2, 3, 62, 66, 54, 8, 78, 7, 12};
        int n = 6;
        int count = 0;
        for (int x : nums) {
            if (x == n) {
                count++;
            }
        }
            System.out.println(count);


        System.out.println("------------");

        // ex number 2

        int[] arr = {12, 26, 2, 18, 56, 6, 3, 56, 45, 10};
        for (int k : arr) {
            System.out.print(k + " ");
        }
        int x = 0;
        for (int i = 0; i < arr.length - 1 - i; i++) {
            x = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = x;

        }
        System.out.println();
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("------------");

        //ex number 3

        int[] numbers = {4, 4, 8, 4, 14, 0, 8, 56, 0, 1};

        int countRepet = 0;

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    sum++;
                }
            }
            if (sum == 1) {
                countRepet++;
            }
        }
            System.out.println(countRepet);



        System.out.println("------------");
        //ex number 4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowel = {'ա', 'ե', 'է', 'ի', 'ո', 'և', 'օ'};
        int countV = 0;
        for (int i : chars) {
            for (int j : vowel) {
                if ( i == j){
                    countV++;
                }
            }
        }
        System.out.println(countV);

        }
    }
