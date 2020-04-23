package main.java.com.SavelevAlexander.javacore.Chapter08;

/* В иерархии классов закрытые члены остаются закрытыми в пределах своего класса
 *
 * Эта программа содержит ошибку, и поэтому скомпилировать ее не удастся
 * */

// создать класс
class A2{
    int i;          // Этот член открыт по умолчанию
    protected int j; // этот член закрыт в классе A // I replaced a modificator access

    void setij(int x, int y){
        i = x;
        j = y;
    }
}

// Чле j  класса А в этом классе недоступен
class B2 extends A2{
    int total;

    void sum(){
        total = i + j; // ОШИБКА: член j в этом классе недоступен
    }
}
public class Access {
    public static void main(String[] args) {
        B2 subOb = new B2();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
