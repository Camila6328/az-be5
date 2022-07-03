package lesson3;

import java.sql.SQLOutput;

public class SwitchApp {
    public static void main(String[] args) {
        int i = 10;
        //System.out.println( i ==2 ? "Ok": i==3 ? "test":"NOne");

        switch (i)
        {
            case 101:
                System.out.println("One"); break;
            case 10:
                System.out.println("two"); break;
            default :
                System.out.println("default");
        }

    }
}
