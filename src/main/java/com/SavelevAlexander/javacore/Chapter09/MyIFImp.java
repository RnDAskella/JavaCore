package main.java.com.SavelevAlexander.javacore.Chapter09;

public class MyIFImp implements MyIF {

    // В этом классе должен быть реализован только метод getNumber()
    // определенный в интерфейсе MyIF
    // а вызоыва метода getString() разрешается по умолчанию
    @Override
    public int getNumber() {
        return 100;
    }

  /*  @Override
    public String getString() {
        return "Я переопределил дефолтный метод";
    }*/
}
