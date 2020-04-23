package main.java.com.SavelevAlexander.javacore.Chapter08.Override;

// Переопределение метода
public class A {
    int i, j;
    A(int a, int b){
        i = a;
        j = b;
    }

    // вывести содержимое переменныз i и j
    void show(){
        System.out.println("i и j: " + i + " " + j);
    }
}
