package homework.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {

        BraceChecker bc = new BraceChecker("he(llo] {from)  [Java}");
        bc.chack();
        System.out.println();
        BraceChecker nbc = new BraceChecker("he(llo] (from)  (Java}");
        nbc.chack();

    }
}
