package main.java.com.SavelevAlexander.javacore.Chapter07;
// Возврат объекта

class Test_RetOb {
    int a;

    Test_RetOb(int i) {
        a = i;
    }

    Test_RetOb incrByTen() {
        Test_RetOb temp = new Test_RetOb(a + 10);
        return temp;
    }
}

public class RetOb {
    public static void main(String[] args) {
        Test_RetOb ob1 = new Test_RetOb(2);
        Test_RetOb ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);
    }
}
