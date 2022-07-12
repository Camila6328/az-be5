package Homework;
import java.util.Random;
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {
        System.out.println("Get ready to rumble!");
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][5];
        int[][] arr_pos = new int[5][5]; //positions

        Random rnd = new Random();
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
        while(true) {
            System.out.print("ENTER Row id: ");
            String s_row = sc.nextLine();
            System.out.print("ENTER Col id: ");
            String s_col = sc.nextLine();
            try {
                int row = Integer.parseInt(s_row);
                int col = Integer.parseInt(s_col);
                if (row < 5 && col < 5) {
                    if (row == r_row && col == r_col) {
                        System.out.println("You have won!!!");
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                arr[row][col] = " X ";
                                arr_pos[row][col] = Integer.parseInt(String.valueOf(r_row) + String.valueOf(r_col));
                                System.out.print(arr[i][j]);
                            }
                            System.out.println();
                        }
                        break;
                    } else {
                        int ind = Integer.parseInt(String.valueOf(row) + String.valueOf(col));
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                if (i == row && j == col) {
                                    arr[row][col] = " * ";
                                    arr_pos[row][col] = ind;//  position[]
                                    System.out.print(arr[i][j]);
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
                System.out.print("Try again: ");
            }
        }


//                for ( int i = 0; i<5;i++){
//                        for (int j = 0; j<5 ; j++){
//
//                                System.out.print(arr_pos[i][j]);
//                        }
//                        System.out.println();
//                }
    }
    }

