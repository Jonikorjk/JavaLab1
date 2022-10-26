package firstTask;

import java.util.Random;

/**
 * The class that solve task standart way
 */
public class StandardMethod {

    final public static String fillSymbol = "$";

    /**
     * <p>fill2DArray()</p>
     * Function for filling a two-dimensional array of ints
     * Function parameters:
     * @param arr Reference to a two-dimensional array of ints
     */
    public static void fill2DArray(int[][] arr)
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                while (true) {
                    arr[i][j] = rand.nextInt(5, 22);
                    if (arr[i][j] % 2 != 0) break;
                }
            }
        }
    }


    /**
     * <p>getMaxOfCol()</p>
     * Function to get the maximum element in a column
     * Function parameters:
     * @param arr Reference to a two-dimensional array of ints
     * @param row is an int variable that specifies the column to be searched
     * @return The maximum element in the column
     */
    public static int getMaxOfCol(int[][] arr, int row)
    {
        if (row < 0 || row > (arr[0].length - 1)) {
            return -1;
        }
        int max = arr[0][row];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i][row]) {
                max = arr[i][row];
            }
        }
        return max;
    }

    /**
     * <p>fillStringArray()</p>
     * Function to populate an array of strings
     * Function parameters:
     * @param stringArr Reference to a one-dimensional array of strings
     * @param intArray Reference to a two-dimensional array of ints
     */
    public static void fillStringArray(String[] stringArr, int[][] intArray)
    {
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = "";
        }
        for (int i = 0; i < stringArr.length; i++) {
            for (int j = 0; j < getMaxOfCol(intArray,i); j++) {
                stringArr[i] += fillSymbol;
            }
        }
    }

    /**
     * <p>PrintArray()</p>
     * Overloaded function that is used to print to standard output
     * Function parameters:
     * @param intArray Reference to a two-dimensional array of integers
     */
    public static void printArray(int[][] intArray)
    {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.print("\n");

        }
    }
    /**
     * <p>PrintArray()</p>
     * Overloaded function that is used to print to standard output
     * Function parameters:
     * @param stringArray A reference to a one-dimensional array of strings
     */
    public static void printArray(String[] stringArray)
    {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    /**
     * <p>sortStringArray()</p>
     * Sorting function, uses bubble sort algorithm
     * Function parameters:
     * @param strArr Reference to an array of strings
     */
    public static void sortStringArray(String[] strArr) {
        String buffer = "";
        boolean mustSort = false;

        do {
            mustSort = false;
            for (int i = 0; i < strArr.length - 1; i++) {
                if (strArr[i].length() < strArr[i + 1].length()) {
                    buffer = strArr[i];
                    strArr[i] = strArr[i + 1];
                    strArr[i + 1] = buffer;
                    mustSort = true;
                    break;
                }
            }
        } while (mustSort);
    }

    /**
     * <p>printMaxArrays()</p>
     * Function for printing maxes of rows of 2d-array
     * Function parameters:
     * @param arr Reference to a two-dimensional array of ints
     */
    public static void printMaxArrays(int[][] arr) {
        System.out.println("Array of max");
        for (int i = 0; i < arr[0].length; i++) {
            int max = arr[0][i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] > max)
                    max = arr[j][i];
            }
            System.out.print(max + " ");
        }
        System.out.println();
    }

    public void start(int rows, int cols) {
        System.out.println("Standart way");

        int[][] intArr = new int[rows][cols];

        System.out.println("2D Array");
        fill2DArray(intArr);
        printArray(intArr);
        printMaxArrays(intArr);

        System.out.println("Reslut");
        String[] strArr = new String[cols];
        fillStringArray(strArr, intArr);
        sortStringArray(strArr);
        printArray(strArr);
    }

}
