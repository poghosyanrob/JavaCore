package lesson8;

import java.util.Scanner;

public class StringScannerExample {
    public static void main(String[] args) {
        System.out.println("input your name");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("name : " + name);

        System.out.println("inout your age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("age : " + age);

    }
}
