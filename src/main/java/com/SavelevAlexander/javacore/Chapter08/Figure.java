package main.java.com.SavelevAlexander.javacore.Chapter08;
// Применение полиморфиза во время выполнения
public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area (){
        System.out.println("Площадь фигуры не определена.");
        return 0;
    }
}
