package lesson14.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {


    public static void main(String[] args) {
        List<String> name = new LinkedList<>();
        name.add("Poxos");
        name.add("Martiros");
        name.add("Harut");
        System.out.println(name.size());
        System.out.println(name.get(0));

//        for (String s : name) {
//            System.out.println(s);
//        }
    }

}
