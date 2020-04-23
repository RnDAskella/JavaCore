package main.java.com.SavelevAlexander.javacore.Chapter09;

public class DeafaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        // Метод getNumber() можно вызвать, т.к. он явно реализован в классе MyIFImp
        System.out.println(obj.getNumber());

        // Метод getString() также можно вызвать, т.к. в интерфейсе имеется его реализация по умолчанию
        System.out.println(obj.getString());
    }
}
