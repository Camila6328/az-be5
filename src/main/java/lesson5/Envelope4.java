package lesson5;

public class Envelope4 {
    public static String makeEnvelope(int width, int height) {
        /** logic / process */
        double k = (double) width / height;
        final int firstRow = 0;
        final int firstCol = 0;
        final int lastRow = height - 1;
        final int lastCol = width - 1;
        final int midrow = (height) /2;
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if ((row == firstRow ||  row == firstRow + 1 ||                // firstRow
                        col == firstCol || col == firstCol + 1 ||                // firstCol
                        col == lastCol || col == lastCol - 1 ||                  // lastCol
                        row == lastRow || row == lastRow - 1 ||                  // lastRow
                        //row == midrow ||
                        col == Math.round(row * k) ||        // diagonal 1
                        col == lastCol - Math.round(row * k) // diagonal 2
                )
                        && !(row == Math.round(height/2) && col == Math.round(width/2))
                     //   && !(row == Math.round(height/2)  && col == Math.round(width/2-1))
                 )
                {
                    sb.append("*");}
                else if ( row == Math.round(height/2) && col == Math.round(width/2)){
                    sb.append("X");
                }
                else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        /** input data */
        int height = 11;
        int width = 21;
        /** call the business logic extracted and decoupled from input and output */
        String result = makeEnvelope(width, height);

        /** output result */
        System.out.println(result);
    }



}


