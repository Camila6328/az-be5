package Homework;
import java.util.Random;
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String[][] arr = new String[5][5];
        int[][] arr_pos = new int[25][2];// positions
        int arr_ind = 0;

        System.out.println("Get ready to rumble!");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = " - ";
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("----------");

        int r_row = rnd.nextInt(5);
        int r_col = rnd.nextInt(5);
        System.out.println("rnd " + r_row+ " " + r_col);

        Lb: while(true) {
            System.out.print("ENTER Row id: ");
            String s_row = sc.nextLine();
            System.out.print("ENTER Col id: ");
            String s_col = sc.nextLine();
            try {
                int row = Integer.parseInt(s_row);
                int col = Integer.parseInt(s_col);
                if (row < 5 && col < 5) {
                    for (int a = 0; a < arr_ind; a++) {
                        if (arr_pos[a][0] == row && arr_pos[a][1] == col) {
                            System.out.println("this id entered previously please Enter again new id:");
                            continue Lb;
                        }
                    }
                    if (row == r_row && col == r_col) {
                        System.out.println("You have won!!!");
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                arr[row][col] = " X ";
                                System.out.print(arr[i][j]);
                            }
                            System.out.println();
                        }
                        break;
                    } else {
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                if (i == row && j == col) {
                                    arr[row][col] = " * ";
                                    arr_pos[arr_ind] = new int[]{row,col};
                                    System.out.print(arr[i][j]);
                                    arr_ind++;
                                } else {
                                    System.out.print(arr[i][j]);
                                }
                            }
                            System.out.println();
                        }
                    }
                } else {
                    System.out.println("Pls ENTER Row & col id again in the range of playing field lines (1-5)");
                }
            } catch (Exception e) {
                System.out.println("Try again: ");
            }
        }
    }
}