package main.java.com.SavelevAlexander.javacore.Chapter06;
/*
В данном примере программы для инициализации размеров
параллелепипеда в классе Box применяется конструктор*/
class Box6 {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box6

    Box6(){
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 myBox1 = new Box6();
        Box6 myBox2 = new Box6();
        double vol;


        // вывести объем первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);

        // вывести объем второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объем равен " + vol);
    }
}