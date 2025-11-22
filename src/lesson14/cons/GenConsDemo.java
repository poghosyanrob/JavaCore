package lesson14.cons;

public class GenConsDemo {

    public static void main(String[] args) {

        GenCons test1 = new GenCons(23);
        GenCons test2 = new GenCons(23.6);
        GenCons test3 = new GenCons(23.5F);
        test1.showVal();
        test2.showVal();
        test3.showVal();
    }
}
