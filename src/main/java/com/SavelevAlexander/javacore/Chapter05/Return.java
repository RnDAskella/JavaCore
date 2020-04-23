package main.java.com.SavelevAlexander.javacore.Chapter05;
// Продемонстрировать применение оператора return
public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До возврата.");

        if(t) return; // возврат в вызывающий метод

        System.out.println("Этот оператор выполняться не будет.");
    }
}
