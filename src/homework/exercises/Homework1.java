package homework.exercises;

public class Homework1 {

    public static void main(String[] args) {
        // home-work number1
        int x = 10;
        int y = 20;
        if (x > y) {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("x—ը մեծ է y—ից");

        }
        if (x < y) {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("y—ը մեծ է x—ից");

        }


        //home-work number2
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        //home-work number3
        int a = 5;
        int b = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b " + " = " + (a + b));

        //home -work number4
        int n = 3;
        for (n = 1; n < 11; n++) {
            System.out.print('\n');
            for (int j = 1; j < 11; j++) {
                int result = n * j;
                System.out.println(n + " * " + j + " = " + result);
            }

        }


    }


}
