package main.java.com.SavelevAlexander.javacore.Chapter07;
/*В этой программе демонстрируется отличие модификаторов public и private*/

class TestAccessTest {
    int a;              // доступ, определенный по умолчанию
    public int b;       // открытый доступ
    private int c;      // закрытый доступ

    // методы доступа к члену с данного класса
    void setC(int i) {  // установить значение члена с данного класса
        c = i;
    }

    int getC(){         // получить значение члена с данного класса
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        TestAccessTest ob = new TestAccessTest();

        // Эти оператора правильны, поэтому члены члены a и b
        // данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // Этот оператор неверен и может вызвать ошибку
        // ob.c = 100; // ОШИБКА!

        // Доступ к члену с данного класса должен осуществляться
        // с помощью методов ее класса
        ob.setC(100); // ВЕРНО!!!
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
