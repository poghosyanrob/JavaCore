package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray num = new DynamicArray();

        for (int i = 1; i < 15; i++) {
            num.add(i);
        }

        num.print();
        System.out.println(num.getByIndex(4));
        num.deleteByIndex(5);
        num.print();
        num.deleteByIndex(-35);
        num.set(4,101);
        num.print();
        num.set(-5,12);
        num.add(2,456);
        num.print();
        num.add(67,74);
        System.out.println(num.exists(101));
        System.out.println(num.exists(9854));
        num.add(3,14);
        num.print();
        System.out.println(num.getIndexByValue(14));
        num.add(0,14);
        num.print();
        System.out.println(num.getIndexByValue(14));
        System.out.println(num.getIndexByValue(0));
    }
}
