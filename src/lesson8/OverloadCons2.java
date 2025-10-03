package lesson8;

public class OverloadCons2 {

    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        Box myclone = new Box(mybox1);

        double vol = mybox1.volume();
        System.out.println("mybox1 : " + vol);

        vol = mybox2.volume();
        System.out.println("mybox2 : " + vol);

        vol = mybox3.volume();
        System.out.println("mybox3 : " + vol);

         vol = myclone.volume();
        System.out.println("myclone : " + vol);
    }

}
