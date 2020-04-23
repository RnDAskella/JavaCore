package main.java.com.SavelevAlexander.javacore.Chapter08;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // переопределить метод area() для четырехугольника

    @Override
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}
