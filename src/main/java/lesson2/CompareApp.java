package lesson2;

public class CompareApp {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        /*
        == equal
        >  more
        <  less
        => more equal
        <= less equal
        != not equal
        */

        if ( a < b ) {
            System.out.println( "a more than b");
        }
        if ( a == b){
            System.out.println("a");
        }
        else {
            System.out.println("b");
        }
        if ( a == b){
            System.out.println("a");

        } else if (a > b){
            System.out.println("b");
        }
        else {
            System.out.println("default");
        }

//        if (a < b)
//            System.out.println("test");
        System.out.println("End");
    }
}
