package lesson2;

public class WhileApp {
    public static void main(String[] args) {
        int i = 0;
        while ( i < 10 ) {
           // System.out.println("Hi"+i);
            i++;
//            if ( i % 2 == 0 ){
//                continue;
//            }

            if ( i == 5 ){
                break;
            }
        }

        int a = 0 ;
        do {
            System.out.println("a: "+ a);
            a++;
        }
            while ( a <= 5 );


    }
}
