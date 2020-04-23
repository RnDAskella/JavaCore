package main.java.com.SavelevAlexander.javacore.Chapter07;

// Объекты передаются по ссылке на них

class Test_PassObjRe {
    int a, b;

    Test_PassObjRe(int i, int j) {
        a = i;
        b = j;
    }

    // Передать объект
    void meth(Test_PassObjRe o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class PassObjRe {
    public static void main(String[] args) {
        Test_PassObjRe ob = new Test_PassObjRe(15, 20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}
