package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray num = new DynamicArray();

        for (int i = 4; i < 18; i++) {
            num.add(i);
        }

        System.out.println(num.getByIndex(54));
        System.out.println(num.getByIndex(4));
        num.print();


    }
}
