package firstTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *  The class which solve task using java.util.Arrays
 */
public class ArraysClassMethod {

    final public static String fillSymbol = "$";

    /**
     * <p>fill1DArray()</p>
     * Creates an array of ints enters a random value from 5 to 21 (inclusive)
     * Used in conjunction with the java.util.Arrays class
     * Function parameters:
     * @param length the length of the returned array
     * @return an array of ints filled with random numbers from the interval [5,21]
     */
    public static int[] fill1DArray(int length) {
        Random rand = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length ; i++) {
            while (true) {
                arr[i] = rand.nextInt(5, 22);
                if (arr[i] % 2 != 0) break;
            }

        }
        return arr;
    }

    /**
     * <p>getMax()</p>
     * Function to get the maximum element in a column
     * Used in conjunction with the java.util.Arrays class
     * Function parameters:
     * @param arr Reference to a two-dimensional array of ints
     * @param j an int variable that specifies the column to be searched
     * @return The maximum element in the column
     */
    public static int getMax(int[][] arr, int j) {
        Integer[] row = new Integer[arr.length];
        Arrays.setAll(row, i -> arr[i][j]);
        Arrays.sort(row, Collections.reverseOrder());
        return row[0];
    }

    public void start(int rows, int cols) {
        System.out.println("class Arrays Way");
        int[][] s_intArr = new int[rows][];
        int[] arr_of_max = new int[cols];
        String[] s_strArr = new String[cols];

        Arrays.setAll(s_intArr, i -> fill1DArray(cols));
        System.out.println("2D Array");
        System.out.println((Arrays.deepToString(s_intArr)));

        System.out.println("Array of max");
        Arrays.setAll(arr_of_max, i -> getMax(s_intArr, i));
        System.out.println(Arrays.toString(arr_of_max));

        Arrays.setAll(s_strArr, i -> fillSymbol.repeat(arr_of_max[i]));
        Arrays.sort(s_strArr, (s1, s2) -> -Integer.compare(s1.length(), s2.length()));

        System.out.println("Result");
        System.out.println(Arrays.toString(s_strArr));
    }
}
