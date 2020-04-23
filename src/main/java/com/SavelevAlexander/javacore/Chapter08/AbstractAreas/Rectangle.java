package main.java.com.SavelevAlexander.javacore.Chapter08.AbstractAreas;

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // переопределить метод area() для чытырехугольника
    @Override
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}
