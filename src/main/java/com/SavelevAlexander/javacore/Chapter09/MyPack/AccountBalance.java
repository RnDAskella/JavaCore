package main.java.com.SavelevAlexander.javacore.Chapter09.MyPack;

public class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("K.J. Fielding", 123.33);
        current[1] = new Balance("Will Tell", 157.02);
        current[2] = new Balance("Tom Jackson", -12.33);

        for (int i = 0; i< 3; i++){
            current[i].show();
        }
    }
}
