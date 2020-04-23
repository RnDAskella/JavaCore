package main.java.com.SavelevAlexander.javacore.Chapter08.Override;

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        A a = new A(2, 5);

        subOb.show("Это k: "); // это перегруженный метод из класса B
        subOb.show(); // здесь вызывается метод show из класса B
    }
}
