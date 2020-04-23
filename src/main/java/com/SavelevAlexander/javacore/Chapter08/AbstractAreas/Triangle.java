package main.java.com.SavelevAlexander.javacore.Chapter08.AbstractAreas;

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // переопределить метод area() для прямоугольного треугольника

    @Override
    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}
