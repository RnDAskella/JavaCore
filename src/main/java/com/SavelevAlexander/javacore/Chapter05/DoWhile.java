package main.java.com.SavelevAlexander.javacore.Chapter05;
// Продемонстрировать применение оператора цикла do-while
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
        } while ( --n > 0); // более элегантно, стоит запомнить, чем в do { n-- }
    }
}
