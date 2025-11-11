package homework.exercises;

public class FigurePainter {
    public static void main(String[] args) {

        System.out.println("-------------");
        System.out.println("number 1");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------");
        System.out.println("number 2");

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------");
        System.out.println("number 3");

        int p = 1;
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < p; j++) {
                System.out.print(" *");
            }
            p++;
            System.out.println();
        }


        System.out.println("-------------");
        System.out.println("number 4");

        int l = 0;
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < l; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            l++;
            System.out.println();
        }

        System.out.println("-------------");
        System.out.println("number 5");

        int k = 1;
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int a = 0; a < k; a++) {
                System.out.print("* ");
            }
            k++;
            System.out.println();
        }
        int t = 4;
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int b = 0; b < t; b++) {
                System.out.print("* ");
            }
            t--;
            System.out.println();
        }


    }
}
