package lesson3;

import java.sql.SQLOutput;

public class StringApp {
    public static void main(String[] args) {
//        char[] chars = {'a','b','2'};
//        String str = new String(chars);
//        System.out.println(str);

        String str1 = "IBAtech";
        String str2 = "iBAtech";
        String str3 = "ibatech";
        String str4 = "ibatech";

//        System.out.println(str1==str2);
//        System.out.println(str1==str3);
//        System.out.println(str1.equals(str3));
//        System.out.println(str4==str3);
//        System.out.println(str4.equals(str3));
//        System.out.println(str1+"test");

        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1);
          System.out.println(str1.getBytes());
        System.out.println(str2.getBytes());
        System.out.println(str2.getBytes().length);


        System.out.println(str1.charAt(1));

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.concat(str2));
        str3.concat("EA");
        System.out.println(str3);
        str3=str3.concat("EA");
        System.out.println(str3);
        System.out.println(str1.endsWith("tech"));
        System.out.println(str1.contains("cah"));

        StringBuffer sBuff = new StringBuffer("String");
        StringBuilder sBuilt = new StringBuilder();
        sBuff.append("wt");
        System.out.println(sBuff);//-------?????
        System.out.printf("%4.4s",32.42);
        System.out.println(String.format("%12.12f s%",32.42,"test"));

    }

}
