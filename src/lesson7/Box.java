package lesson7;

public class Box {
    double width;
    double height;
    double depth;

//    void volume() {
//        System.out.println(width * height * depth);
//    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

//    int square(int i) {
//        return i * i;
//    }


}
