package lessone2;

public class IfSample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x меньше у");
        }

        x *= 2;
        if (y ==x) {
            System.out.println("x теперь равно у");
        }
        x *= 2;
        if (x> y) {
            System.out.println("x теперь больше у");
        }
        if(x == y) {
            System.out.println("вы не увидите этого");
        }

    }
}
