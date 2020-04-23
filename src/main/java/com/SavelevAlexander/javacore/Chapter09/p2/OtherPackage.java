package main.java.com.SavelevAlexander.javacore.Chapter09.p2;

import main.java.com.SavelevAlexander.javacore.Chapter09.p1.Protection;

public class OtherPackage {
    OtherPackage(){
        Protection p = new Protection();
        System.out.println("конструктор из другого пакета");

        // доступно только для данного класса
        //System.out.println("n =" + p.n);

        // доступно только для данного класса
        //System.out.println("n_pro = " + p.n_pri);

        // доступно только для данного класса, подкласса или пакета
        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}