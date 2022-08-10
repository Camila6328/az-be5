package lesson9;

public class namingNumber {
    // Driver code
            public static  void main (String[] args)
            {
                int num = 1325;
                int minlik = num/1000;
                int yuzluk = (num - minlik*1000)/100;
                int onluq = (num- minlik*1000 - yuzluk*100)/10;
                int teklik = num - minlik*1000 - yuzluk * 100 - onluq * 10;

                String s;
                if ( minlik == 0 ) {s ="";}
                else if ( minlik == 1 ) {}
                System.out.println(minlik+ " " + yuzluk+" " + onluq+ " "+ teklik);
            }
        }

