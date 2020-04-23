package main.java.com.SavelevAlexander.javacore.Chapter05;

// Проверить на простые числа
public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;

        if(num <2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num%2) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime = true) System.out.println("Простое число");
        else System.out.println("Не простое число");
    }
}
