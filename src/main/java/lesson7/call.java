package lesson7;

import java.util.Scanner;

public class call {

    public static int toInt(String s){
        return Integer.parseInt(s);
    }

    public static int[] getNumbers(Scanner in){
        String line = in.nextLine();
        String[] items = line.split(" ");
        int[] a = {
                toInt(items[0]),
                toInt(items[1]),
                toInt(items[2])
        };

        return a;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] numbers1 = getNumbers(in);
        int [] numbers2 = getNumbers(in);
        String boxParamsOne = in.nextLine();
        String boxParamsTwo = in.nextLine();
        String[] boxParamsOneArr = boxParamsOne.split(" ");
        String[] boxParamsTwoArr = boxParamsTwo.split(" ");

        Box boxOne = new Box(numbers1[0],numbers1[1],numbers1[2]);
        Box boxTwo = new Box(numbers1[0],numbers1[1],numbers1[2]);

        String result = boxOne.compare(boxTwo)?
                String.format("Box %s fits into box %s",boxOne,boxTwo):
                String.format("Box %s doesn't fit into box %s",boxOne,boxTwo);
        System.out.println(result);
        }
    }

