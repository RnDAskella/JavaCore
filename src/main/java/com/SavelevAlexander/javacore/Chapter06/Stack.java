package main.java.com.SavelevAlexander.javacore.Chapter06;

// В этом классе определяется целочисленный стек, в котором
// можно хранить до 10 целочисленных значений
public class Stack {
    int[] stck = new int[10];
    int tos;

    // инициализировать вершину
    Stack() {
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен");
        } else {
            stck[++tos] = item;
        }
    }

    // извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}
