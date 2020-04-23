package main.java.com.SavelevAlexander.javacore.Chapter08.Override;

public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // вывести содержимое переменной k с помощью метода
    // переопреляющего метод show() из класса А
    void show() {
        super.show(); // здесь вызывается метод show() из класса
        System.out.println("k: " + k);
    }

    // перегрузить метод show()
    void show(String msg){
        System.out.println(msg + k);
    }
}
