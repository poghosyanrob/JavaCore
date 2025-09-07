package lesson3;

public class Light {

    public static void main(String[] args) {

        int lightspeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = lightspeed * seconds;
        System.out.print("Зa " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");


        char ch1 = 88;
        char ch2 = 'Y';
        System.out.print("ch1 и ch2: ");
        System.out.println(ch1 + " " + ch2);

        char cha1 = 'X';
        System.out.println("ch1 содержит " + cha1);

        cha1++;
        System.out.println("ch1 теперь содержит " + cha1);


        boolean b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        if (b) {
            System.out.println("Этoт код выполняется.");
        }
        b = false;
        if (b) {
            System.out.println("Этoт код не выполняется.");
        }
        System.out.println("10 > 9 равно " + (10 > 9));


        double a = 3.0;
        double d = 4.0;
        double c = Math.sqrt(a * a + d * d);
        System.out.println("Гипoтeнyзa равна " + c);


        int x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x и у: " + x + " " + y);
            x = y * 2;
        }
        System.out.println("x равно " + x);


        for (int z = 0; z < 3; z++) {
            int k = -1;
            System.out.println("k равно: " + k);
            k = 100;
            System.out.println("k теперь равно: " + k);
        }


        int t = 257;
        double q = 323.142;

        System.out.println("\nПреобразование типа int в тип byte.");
        byte l = (byte) t;

        System.out.println("t и l " + t + " " + l);
        System.out.println("\nПреобразование типа douЫe в тип int.");
        t = (int) q;
        System.out.println("q и t " + q + " " + t);

        System.out.println("\nПреобразование типа douЫe в тип byte.");

        l = (byte) q;

        System.out.println("q и l " + q + " " + l);


        byte v = 42;
        char z = 'a';
        short s = 1024;
        int m = 50000;
        float f = 5.67f;
        double e = .1234;
        double result = (f * v) + (m / z) - (e * s);
        System.out.println((f * v) + " + " + (m / z) + " + " + (e * s));
        System.out.println("result: " + result);


    }


}
