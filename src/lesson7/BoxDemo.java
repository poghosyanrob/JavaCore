package lesson7;

public class BoxDemo {
    public static void main(String[] args) {
//        Box mybox1 = new Box();
//        Box mybox2 =new Box();
//
//        mybox1.height = 20;
//        mybox1.width = 10;
//        mybox1.depth = 15;
//
//        mybox2.height = 6;
//        mybox2.width = 3;
//        mybox2.depth = 9;
//        mybox1.volume();
//
//        double vol = mybox2.volu();
//        System.out.println("return : " + vol);

//        int i = mybox1.square(7);
//
//        System.out.println(i);

        Box mybox = new Box(10,20,15);
        System.out.println(mybox.volume());

    }
}
