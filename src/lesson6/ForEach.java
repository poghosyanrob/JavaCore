package lesson6;

public class ForEach {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//
//        int sum = 0;
//        int coumt = 0;
//        for (int x :nums){
//
//            if(coumt == 5){
//                break;
//            }
//            coumt++;
//            sum += x;
//            System.out.print(x + " ");
//
//        }
//        System.out.println();
//        System.out.println(sum);


        int sum = 0;
        int num[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int x[] : num) {
            for (int y : x) {
                System.out.println("number = " + y);
                sum += y;
            }
        }
        System.out.println("summa = " + sum);


    }
}
