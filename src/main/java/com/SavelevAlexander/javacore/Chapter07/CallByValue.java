package main.java.com.SavelevAlexander.javacore.Chapter07;

//Аргументы примитивных типов передаются по значению
class Test_CallByValue {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test_CallByValue ob = new Test_CallByValue();

        int a = 15, b = 20;

        System.out.println("a и b до вызова: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
