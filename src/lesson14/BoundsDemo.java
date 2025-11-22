package lesson14;

public class BoundsDemo {

    public static void main(String[] args) {

        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);

        double v = iob.average();

        System.out.println(v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double d = dob.average();
        System.out.println(d);




    }


}
