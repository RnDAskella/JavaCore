package main.java.com.SavelevAlexander.javacore.Chapter09;
// Реализовать интерфейс MiIF
public interface MyIF {

    // Это объявление обычного метода в интерфейсе.
    // Он не предоставляет реализацию по умолчанию
    int getNumber();

    // А это объявление метода по умолчанию. Обратите
    // внимание на его реализацию по умолчанию
    default String getString(){
        return "Объект типа String по умолчанию";
    }

    // Это объявление статического метода в интрефейсе
    static int getDefaultNumber(){
        return 0;
    }
}
