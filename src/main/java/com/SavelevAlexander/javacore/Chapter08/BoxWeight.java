package main.java.com.SavelevAlexander.javacore.Chapter08;

// В этой программе наследование применяется для расширения класса Box
class Box {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    Box(Box ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отсутствие размеров
    Box() {
        width = -1;     // значение -1 служит для обозначения
        height = -1;    // неинициализированного
        depth = -1;     // параллелепипеда
    }

    // конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем куба
    double volume() {
        return width * height * depth;
    }
}

// расширить класс Box, включив в него поле веса
public class BoxWeight extends Box {
    double weight;

    // сконструировать клон объекта
    BoxWeight (BoxWeight ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // вызывать конструктор суперкласса
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight(){
        super();
        weight = -1;
    }

    // конструктор, применяй при создании куба

    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}

class ColorBox extends Box{
    int color; // цвет параллелепипеда

    ColorBox(double w, double h, double d, int c){
        super(w, h, d);
        color = c;
    }
}

class DemoBoxWeight{
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15,34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();
    }
}
