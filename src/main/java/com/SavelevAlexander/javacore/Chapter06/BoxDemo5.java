package main.java.com.SavelevAlexander.javacore.Chapter06;
//В этой программе применяется метод с параметрами
class Box5 {
    double width;
    double height;
    double depth;

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
    // установить параметры параллелепипеда
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}


public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 myBox1 = new Box5();
        Box5 myBox2 = new Box5();
        double vol;

        //инициализировать каждый экземпляр класса Box
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        // вывести объем первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        // вывести объем второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
    }
}

