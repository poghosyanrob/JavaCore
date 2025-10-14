package lesson9.figurs;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);

    }
    double area () {
        System.out.println(".....");
        return dim1 * dim2 / 2;
    }
}
