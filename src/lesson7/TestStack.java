package lesson7;

public class TestStack {

    public static void main(String[] args) {

        Stack mystack1 = new Stack();
        Stack mystack2  = new Stack();

        for (int i = 24; i < 34; i++) {
            mystack1.push(i);
        }

        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(mystack1.pop() + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(mystack2.pop() + " ");
        }
    }

}
