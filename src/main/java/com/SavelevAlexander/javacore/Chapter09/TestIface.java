package main.java.com.SavelevAlexander.javacore.Chapter09;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        Client d = new Client();
        c.callback(42);
        d.nonIfaceMeth();
    }
}
