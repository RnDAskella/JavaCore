package main.java.com.SavelevAlexander.javacore.Chapter08;

// Использовать ключевое слово super с целью предотвратить сокрытие имен
class A3 {
    int i;
}

// создать подкласс путем расширения класса А
class B3 extends A3 {
    int i; // Этот член i скрывает член i из класса А

    B3(int a, int b) {
        super.i = a; // член i из класса А
        i = b;       // член i из класса B
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }

}

public class UseSuper {
    public static void main(String[] args) {
        B3 subOb = new B3(1, 2);

        subOb.show();
    }
}
