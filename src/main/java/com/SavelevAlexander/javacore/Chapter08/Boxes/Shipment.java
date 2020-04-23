package main.java.com.SavelevAlexander.javacore.Chapter08.Boxes;

// добавить поле стоимости доставки
public class Shipment extends BoxWeight {
    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob){ // передать объекта конструктору
        super(ob);
        cost = ob.cost;
    }

    // конструктор, используемый при указании всех параметров
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }

    // конструктор, применямый по умолчанию
    Shipment(){
        super();
        cost = -1;
    }

    // конструктор, применяемый при создании куба
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}
