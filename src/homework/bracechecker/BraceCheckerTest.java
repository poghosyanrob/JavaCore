package homework.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {

        BraceChecker bc = new BraceChecker();
        String text = "(((((he[llo} {from)  [Java]))";
        bc.chack(text);

    }
}
