package main.java.com.SavelevAlexander.javacore.Chapter03;

public class Scope  {
    public static void main(String[] args) {
        int x; // Эта переменная доступна всему коду из метода main()
        x = 10;
        if(x == 10) { // начало новой области действия
            int y = 20; // доступна только этому блоку кода

            // обе переменные x и y доступны в этой области действия
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        //100; // Ошибка! Переменная Y недоступна
        // в этой области действия, тогда как
        // переменная x доступна и здесь

        System.out.println("x равно " + x);
    }
}
