package main.java.com.SavelevAlexander.javacore.Chapter08.AbstractAreas;

class AbstractAreas {
    public static void main(String[] args) {
        // Figure f = new Figure(10, 10); // теперь недопустимо
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref; // верно, но объект не создается

        figref = r;
        System.out.println("Площади равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());



    }
}

