package example;

/**
 * Question 12
 */
public class MatrixTranspose {
    static int[][] array = new int[][]{{1,2,3}, {4, 5, 6}, {7, 8, 9}};

    public static void main(String[] args) {

        int i,j;
        array = transpose(array);
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+"   ");
            }
            System.out.println(" ");
        }
    }
    static int[][] transpose(int[][] array){
        int i, j;
        int[][] result = new int[][]{{' ',' ',' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[0].length; j++) {
                result[j][i] = array[i][j];
            }
        }
        array = result;
        return array;
    }
}
