package Homework;
import java.util.Random;

public class homwork1_2 {
        public static void main(String[] args) {
                String[][] arr = {{"1914","1939","1988","2020"},
                                        {"World War I", "World War II","First Nagorno-Karabakh War","The Second Karabakh War"}};
//                for(int i=0;i<arr.length;i++){
//                        for(int j=0;j<arr[i].length;j++){
//                                System.out.print(arr[i][j]+" ");
//                        }
//                        System.out.println();
//                }
                System.out.println();
                int rnd = new Random().nextInt(3);
                System.out.println("When did the "+ arr[1][rnd] +" begin?" + " - " + arr[0][rnd]);
        }
}