package lesson5;

public class OpEquals {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        a += 5;
//        b *= 4;
//        c %= a * b;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);

        int num = 0xFFFFFFE;
        for (int i = 0; i < 4; i++) {
            System.out.println(num);
            num = num << 1;
            System.out.println(num);
        }
    }
}
