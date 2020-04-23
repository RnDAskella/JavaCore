package main.java.com.SavelevAlexander.javacore.Chapter09;

public class DynStack implements IntStack {
    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // выделить память и инициализировать стек
    @Override
    public void push(int item) {
        // если стек заполнен, выделить память под стек большего размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; // удвоить размер стека
            for (int i = 0; i < stck.length; i++) {
                stck = temp;
                stck[++tos] = item;
            }
        } else {
            stck[++tos] = item;
        }
    }

    // разместить элемент в стеке
    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек загружен.");
            return 0;
        }else
            return stck[tos--];
    }
}
