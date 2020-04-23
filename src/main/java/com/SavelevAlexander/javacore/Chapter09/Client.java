package main.java.com.SavelevAlexander.javacore.Chapter09;

public class Client implements Callback {
    // реализовать интерфейс Callback
    @Override
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значение " + p);
    }

    void nonIfaceMeth() {
        System.out.println("В классех, реализующих интрефейсы," + "могут определяться и другие члены.");
    }

}
