package lesson3;

public class MultyArrayApp {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        String [][] stringArr= {{"name", "secname","class"},  {"one","2","3"}};

                for (int i = 0; i<2; i++) {
                    for (int j = 0; j<3; j++){
                        System.out.println(arr[i][j]);
                    }
        }
    }
}
