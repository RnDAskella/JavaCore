package main.java.com.SavelevAlexander.javacore.Chapter08.Boxes;

// Расширение класса BoxWeight включением в него поля стоимости доставки
class Box {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    Box(Box ob) {
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

    //конструкор, применямый в отсутствие размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, применямый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}
