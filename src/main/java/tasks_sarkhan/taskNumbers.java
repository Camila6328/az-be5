package tasks_sarkhan;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class taskNumbers {
    static List evenNum = new ArrayList<Integer>();
    static List oddNum = new ArrayList<Integer>();
    static int qaliq = 0;
    static int esas = 0;

    public static List evenNumber(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 1) {
                evenNum.add(i);
            }
        }
        return evenNum;
    }
    public static List oddNumber(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                oddNum.add(i);
            }
        }
        return oddNum;
    }
    public static double divide(int bolunen, int bolen) {
        esas = bolunen / bolen;
        return esas;
    }

    public static double mod(int bolunen, int bolen) {
        qaliq = bolunen % bolen;
        return qaliq;
    }

    public static List allNum(int num){
        List all = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
            all.add(i);
        }
        return all;
    }
    public static List complexNum(int num){
        List complex = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++) {
           // AllList(num);
            for (int b = 2; b < i; b++) {
                if (mod(i, b) == 0 && i != b) {
                    complex.add(i);
                    break;
                }
            }
        }
        return complex;
    }
    public static List simpleNum(int num){
        List simple = new ArrayList<Integer>();
        simple.add(1);
        simple.add(2);
        simple = (List) allNum(num).stream()
                .filter(e -> !complexNum(num).contains(e))
                .collect (Collectors.toList()); // (3)
        return simple;
    }

    public static int lenNumbers(int num){
        return String.valueOf(num).length();
    }
    public static int sumNumbers(int num){
     int sum = 0;
     for ( int i= 0 ; i <= lenNumbers(num); i++){
         int tam = (int) divide(num,10);
         int  qaliq = num - tam * 10;
         num=tam;
         sum = sum + qaliq;
     }      return sum;
 }
    public static void changeNumbers(int a, int b){
//       b = a - b;
//        a = a;
//        b = a + b ;
//        a = b - a;
//        b = b - a;
//        a = b - a;
     a = a - b;
     b = a + b;
     a = b - a;
     System.out.println( "a = " + a + " " + " b = " + b);
 }
    public static int factorial(int num){
        if ( num == 0){
            return 1;
        }
        else {
            int newVal = num * factorial(num - 1);
            return newVal;
     }
 }
    public static String reverseStr(String s) {
        //int len = (int) Math.ceilDiv(s.length(), 2);
        String newStr = "";
        for (int k = s.length() - 1; k >= 0; k--) {
            newStr = newStr + s.charAt(k);
        }
        return newStr;
    }
    public static String oppositeStr(String s){
        if(s.equals(reverseStr(s))){
          //  "SOS" - "SOS" -> true
            return "'" + s + "' - '" + reverseStr(s) + "' - > true"  ;
        }
    return "'" + s + "' - '" + reverseStr(s) + "' - > false"  ;
}
    public static void printChar(int a, char c, boolean altAlta) {
        for (int i = 0; i < a ; i++) {
            if (altAlta == true) {
                System.out.println(c);
            } else {
                System.out.print(c);
            }
        }
    }
    public static void mathPow(int a, int b, int c){
        for (int i = a; i<=b; i++){
            System.out.printf("MathPow("+ a + "," +  b + "," +  c + ") -> " + i + "^" + c + "="
                        + (int) Math.pow(i,c) + "\n");
        }
    }
    public static int posNegDef(int num){
        if ( num > 0) {
            return 1;
        } else if (num == 0) {
            return 0;
        }else return -1;
    }
    public static boolean checkTwo(int a, int b, int c, int d){
        if( a == b | a == c | a == d | b == c | b == d | c == d ){
          return true;
        }
        else return false;
    }
    public static boolean sortNum(int a, int b, int c, int d){
        if( a < b && b < c && c < d ){
            return true;
        }
        return false;
    }
    public static char indChar(String s, int a){
        return s.charAt(a-1);
    }
    public static boolean equalStr(String s1, String s2){
        return s1.equals(s2);
    }
    public static String repeatChar(String s,char c, int cnt){
        String sc = "";
        for (int i = 0; i < cnt; i++) {
            sc = sc + c;
        }
        return s+sc;
    }
    public static boolean checkStr(String a, String b, String c){
        if (a.contains(c) && b.contains(c)) {
            return true;
        }else
        return false;
    }
    public static String substr(String s, int a, int b){
        String newS = "";
        for (int i = a; i < b ; i++) {
            newS =  newS + s.charAt(i);
        }
        return newS;
    }
    public static String biglenStr(String s, String s2){
        if (s.length()>=s2.length()){
            return s;
        }else return s2;
    }
    public static String letterCase(String s){
        String newStr = "";
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == (s.toLowerCase().charAt(i))) {
                newStr = newStr + s.toUpperCase().charAt(i);
            } else {
                newStr = newStr + s.toLowerCase().charAt(i);
            }
        }
        return newStr;
    }
    public static String replaceBlank(String s){
     return s.trim();
    }
    public static void quadEquation( int a,int b,int c){
        int result = b*b - 4*a*c;
        if ( result > 0){
            double r1 = (-b + Math.pow(result,0.5))/2*a;
            double r2 = (-b - Math.pow(result,0.5))/2*a;
            System.out.println("r1 = "+ r1 + " r2 = "+ r2);
        } else if (result == 0){
            double r1 = -b/2*a;
            System.out.println("r1 = r2 = "+ r1);
        }else{
            System.out.println("The equation has no real roots.");
        }
    }
    public static int greatNum(int a, int b, int c){
        if (a >= b && a >= c ){
            return a;
        } else if (b >=a && b >= c ){
            return b;
        } else if (c >= a && c > b) {
            return c;
        }
        return 0;
    }
    public static String floatPointNum(int num){
        if ( num == 0 ){
            return "ZERO";
        } else if (num>0 && num < 100000) {
            return "Pozitive";
        }
        else if (num < 0){
        return "negative";
            }
        else {
            return "Large";
        }
    }
    public static String getDayName(int dayNum){
        String dayName="";
        switch (dayNum){
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }
        return dayName;
    }
    public static String pointNumCheck(double num1, double num2){
        num1 = Math.round(num1*1000)/1000;
        num2 = Math.round(num2*1000)/1000;
        System.out.println(num1+ " " + num2);
        if (num1 == num2 ){
            return "They are the same up to three decimal places";
        }
        return "They are different";
    }
    public static int cntOfMonthDays(int month, int year){
        return YearMonth.of(year, month).lengthOfMonth();
    }
    public static String leapYearTest(int year){
        boolean div4 = year % 4 == 0; // LEAF
        boolean div100 = year % 100 != 0; //
        boolean div400 = year % 400 == 0;
        System.out.println(div4+ " " + div100 + " " + div400 + " " + (div4 && (div100 || div400)));
        if ( div4 && (div100 || div400)){
            return "Leap Year";
        }
        return "Not Leap Year";
    }
    public static String alphabetVal(String s){
        boolean uppercase = s.charAt(0) >= 65 && s.charAt(0) <= 90;
        boolean lowercase = s.charAt(0) >= 97 && s.charAt(0) <= 122;
        boolean vowels = s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u");
        boolean upVowels = s.equals("A") || s.equals("E") || s.equals("I") || s.equals("O") || s.equals("U");

        if (s.length()>1){
            return "Pls enter letter one Character";
                     }
        else {
            if (!(uppercase || lowercase)){
                return "pls enter lowerCase or upperCase letter";
            }
            else if (vowels||upVowels){
                return "this is vowel";
            }
            else return "this is Consonant";
        }

    }
    public static int sumOfNumbers(int num){
        int sum = 0;
        for (int i = 0; i <= num ; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static int avgOfNumbers(int num){
        return sumOfNumbers(num)/num;
    }
    public static String cubeOfNUmbers(int num){
        return "Number is : "+ num +" and cube of "+num+" is : "+ (int) Math.pow(num,3);
    }
    public static int sumOfOddNum(int num){
        int sum = 0;
        for (int i = 0; i <=num; i++) {
            if (i%2==1){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void calcTable(int num){
        for (int i = 0; i <=5 ; i++) {
        System.out.println(i + " X " + num + " = " + i*num);
    }
    }

    public static void rightAngleTriangle(int num){
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void rightAngleTriangle2(int num){
        for (int i = 1; i <=num ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void floydAngleTriangle3(int num){
        int k=1;
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    public static void atTriangle(int num){
        for (int i = 1; i <= num ; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void starTriangle(int num){
        for (int i = num; i >=1 ; i--) {

            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numTriangle(int num){
        for (int i = 1; i<=num ; i++) {

            for (int j = num; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(k);
            }
            for (int k = 0; k < i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Ededi daxil edin: ");
         // int num = sc.nextInt();//
          int num = 12345;
          numTriangle(5);
//        starTriangle(5);
//        atTriangle(5);
//        floydAngleTriangle3(5);
//        rightAngleTriangle2(5);
//        rightAngleTriangle(10);
//        System.out.println(sumOfOddNum(7));
//        System.out.println(oddNumber(7));
//        calcTable(5);
//        System.out.println(cubeOfNUmbers(3));
//        System.out.println(sumOfNumbers(5));
//        System.out.println(avgOfNumbers(5));
//        System.out.println(leapYearTest(2400));
//        System.out.println(alphabetVal(";"));
//        System.out.println(cntOfMonthDays(2,2022));
//        System.out.println(pointNumCheck(12.251,12.939));
//        System.out.println(getDayName(2));
//        System.out.println(floatPointNum(100000));
//        System.err.println(greatNum(23,19,25));
//        quadEquation(1,5,2);
//        System.out.println(replaceBlank("     Salam necesen ishler nece gedir      "));
//        System.out.println(letterCase("HeLLo WorlD"));
//        System.out.println(biglenStr("hello","WORLD1"));
//        System.out.println(substr("Hello World",3,7));
//        System.out.println(checkStr("MASALAM","SALA","SAL"));
//        System.out.println(repeatChar("soz",'c', 5));
//        System.out.println(equalStr("salam","salam1"));
//        System.out.println(indChar("SALAM",4));
//        System.out.println(sortNum(1,2,3,5));
//        System.out.println(checkTwo(2,3,1,2));
//        System.out.println(posNegDef(20));
//        mathPow(1,5,2);
//        printChar(5,'a',false);
//        System.out.println( reverseStr("SOBOOS"));
//        System.out.println(oppositeStr("474"));
//          System.out.println(lenNumbers(num));
//          System.out.println(sumNumbers(num));
//          System.out.println( evenNumber(num)) ;
//          System.out.println(allNum(num));
//          System.out.println(complexNum(num));
//          System.out.println(factorial(3));
//          changeNumbers(12,10);
//          System.out.println(factorial(3));
//          changeNumbers(12,10);
//          System.out.println(simpleNum(num));


    }
}

