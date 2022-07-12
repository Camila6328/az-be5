package Homework;

public class test {
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = new int[5][5];//{{1,2,3,4,5},{1,2,3,4,5}};
        printMatrix(arr);

    }
}
