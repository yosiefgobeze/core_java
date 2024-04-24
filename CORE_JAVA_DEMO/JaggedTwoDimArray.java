package CORE_JAVA_DEMO;
public class JaggedTwoDimArray {
    // a two dimension array where the column is not fixed size is called a jagged two dimensional array
    public static void main(String[] args) {

        int[][] matches = new int[3][]; // jagged two dimensional array
        matches[0] = new int[3];
        matches[1] = new int[4];
        matches[2] = new int[5];

        for(int i = 0; i < matches.length; i++){
            for(int j = 0; j < matches[i].length; j++){
                matches[i][j] = (int)(Math.random()*10);
            }
        }

        for (int[] match : matches) {
            for (int m : match) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
