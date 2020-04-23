package main.java.com.SavelevAlexander.javacore.Chapter09;

// Определить интерфейс для целочисленного стека
public interface IntStack {
    void push(int item);    // сохраниить элемент в стеке
    int pop();              // извлечь элемент из стека

    default void clear(){
        System.out.println("Метод clear() не реализован.");
    }
}
