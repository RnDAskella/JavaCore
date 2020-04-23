package main.java.com.SavelevAlexander.javacore.Chapter09;

import main.java.com.SavelevAlexander.javacore.Chapter09.MyPack.*;

public class TestBalance {
    public static void main(String[] args) {
        /* Класс Balance объявлен как public, поэтому им можно воспользоваться и вызвать его конструктор
         * */
        Balance test = new Balance("J. J. Jaspers", 99.88);

        test.show(); // можно также вызвыать метод show()
    }
}
