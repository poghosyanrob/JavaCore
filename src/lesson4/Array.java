package lesson4;

public class Array {
    public static void main(String[] args) {

//        int[] mouthDays = new int[12];
//        mouthDays[0] = 31;
//        mouthDays[1] = 28;
//        mouthDays[2] = 31;
//        mouthDays[3] = 30;
//        mouthDays[4] = 31;
//        mouthDays[5] = 30;
//        mouthDays[6] = 31;
//        mouthDays[7] = 31;
//        mouthDays[8] = 30;
//        mouthDays[9] = 31;
//        mouthDays[10] = 30;
//        mouthDays[11] = 31;

//        int []mouthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
//
//        System.out.println("В апреле " + mouthDays[3] + " дней.");


//        int[][] twod = new int[4][5];
//
//        int k = 0;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                twod[i][j] = k ;
//                k++;
//            }
//        }
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(twod[i][j] + "  ");
//            }
//            System.out.println();
//        }

//
//
//        int[][] twod = new int [4][];
//
//        twod[0] = new int[1];
//        twod[1] = new int[2];
//        twod[2] = new int[3];
//        twod[3] = new int[4];
//
//        int k = 0;
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                twod[i][j] = k;
//                k++;
//            }
//        }
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print(twod[i][j] + "  ");
//
//            }
//            System.out.println();
//        }


//        double[][] m = {
//                {1 * 2, 1 * 4, 1 * 5},
//                {2 * 4, 2 * 5, 2 * 6}
//        };
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(m[i][j] + "  ");
//            }
//            System.out.println();
//        }


        int[][][] threed = new int[3][4][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threed[i][j][k] = i * j * k;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(threed[i][j][k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
