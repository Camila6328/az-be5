package tasks_sarkhan;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class taskArrays {
    public static void intSort(int [] a){
        Arrays.sort(a);
    }
    public static void strSort(String [] a){
        Arrays.sort(a);
    }
    public static int sumArr(int [] a){
        int s = 0;
        for (int i = 0; i < a.length ; i++) {
            s = s + a[i];
        }
        return s;
    }
    public static void printddef(int cnt){
        for (int i = 0; i <=cnt; i++) {
            for (int j = 0; j <= cnt; j++) {
                System.out.print(" - ");
            }
            System.out.println();
        }
    }

    public static String avgArr(int[] a){
        DecimalFormat df = new DecimalFormat("#.00");
        return  df.format((double) sumArr(a)/a.length);
    }
    public static boolean checkValArr(int[] a, int val){
       return stream(a).filter(b->b==val).findAny().isPresent();
    }
    public static int findIndex(int[] a, int val){
        int index = 0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==val){
                index = i;
            }
        }
        return index;
    }
    public static int[]  removeInd(int [] arr, int a) {
        if (arr == null
                || a < 0
                || a >= arr.length) {
            return arr;
        }
        List<Integer> arrayList = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());
        arrayList.remove(a);
        return arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int[] addInd(int [] arr, int ind, int val){
        if( ind < 0 ){
            return arr;
        }
        List<Integer> arrayList = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());
        arrayList.add(ind,val);
        return arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int [] numArr = {1,4,3,2,7,99,9};
        String [] strArr = {"test","arr","sarkhan","Samir","Resullu"};
        intSort(numArr);
        strSort(strArr);
        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(strArr));
        System.out.println(sumArr(numArr));
        System.out.println(avgArr(numArr));
        // System.out.println((double) sumArr(numArr)/numArr.length);
        //printddef(10);
//        System.out.println(checkValArr(numArr,21));
//        System.out.println(findIndex(numArr,4));
        System.out.println(Arrays.toString( removeInd(numArr,2)));
        System.out.println(Arrays.toString( numArr));
        System.out.println(Arrays.toString(addInd(numArr,4,11)));
    }
}
