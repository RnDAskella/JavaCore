package main.java.com.SavelevAlexander.javacore.Chapter09;
class A{
    // это вложенный интерфейс
    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF{
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
public class NestedIFDemo {
    public static void main(String[] args) {

        // использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательное");
        if (nif.isNotNegative(-12)) {
            System.out.println("Это не будет выведено");
        }
    }
}
