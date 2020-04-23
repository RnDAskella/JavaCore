package main.java.com.SavelevAlexander.javacore.Chapter08.Dispatch;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();  // объект класса А
        B b = new B();  // объект класса В
        C c = new C();  // объект класса С

        A r;            // получить ссылку на объект типа А

        r = a;          // переменная r ссылается на объект типа А
        r.callme();     // вызвать вариант метода callme(), определенный в классе А

        r = b;          // переменная r ссылается на объект типа В
        r.callme();     // вызвать вариант метода callme(), определенный в классе B

        r = c;          // переменная r ссылается на объект типа С
        r.callme();     // вызвать вариант метода callme(), определенный в классе С
    }
}
