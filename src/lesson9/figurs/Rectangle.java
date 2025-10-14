package lesson9.figurs;

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);

    }
    double area () {
        System.out.println("B области четырехугольника.");
        return dim2 * dim1;
    }
}
