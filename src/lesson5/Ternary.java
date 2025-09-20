package lesson5;

public class Ternary {
    public static void main(String[] args) {
        int i = 10;
        int k = i < 0 ? -i : i;
        System.out.println(i + " равно " + i);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.println(i + " равно " + k);

    }
}
