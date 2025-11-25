package lesson11;



public class EnamDemo {
    public static void main(String[] args) {

        Apple ap = Apple.valueOf ( "Winesap");
        Apple [] allapples = Apple.values();
        for (Apple a : allapples){
            System.out.print(a+" ");

        }


    }
}
