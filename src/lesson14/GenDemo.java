package lesson14;

public class GenDemo {

    public static void main(String[] args) {

        Gen<Integer> iob = new Gen<>(88);

        iob.showType();
        int v = iob.getOb();
        System.out.println(v);

    }

}
