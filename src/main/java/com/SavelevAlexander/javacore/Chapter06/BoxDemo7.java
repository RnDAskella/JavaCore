package main.java.com.SavelevAlexander.javacore.Chapter06;
/*В данном примере программы для инициализации  размеров
параллелепипеда в классе Box применяется параметризованный конструктор*/
class Box7 {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box7
    Box7(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 myBox1 = new Box7(10, 20, 15);
        Box7 myBox2 = new Box7(3, 6, 9);
        double vol;

        // получить объем первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);


    }
}
