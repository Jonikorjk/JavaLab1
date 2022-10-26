package firstTask;

import java.util.Random;

/**
 * The class that solve task standart way
 */
public class StandartWay {
    final public static String fillSymbol = "$";

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
                if (strArr[i].length() > strArr[i + 1].length()) {
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
     * <p>getMaxOfRow()</p>
     * Function to get the maximum element in a row
     * Function parameters:
     * @param arr Reference to a two-dimensional array of ints
     * @param row is an int variable that specifies the row to be searched
     * @return The maximum element in the row
     */
    public static int getMaxOfRow(int[][] arr, int row)
    {
        int max = arr[row][0];
        for (int i = 0; i < arr[0].length; i++) {
            if (max < arr[row][i]) {
                max = arr[row][i];
            }
        }
//        System.out.println(max);
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
            for (int j = 0; j < getMaxOfRow(intArray,i); j++) {
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
                arr[i][j] = rand.nextInt(4, 34);
            }
        }
    }

    /**
     * <p>printMaxArrays()</p>
     * Function for printing maxes of rows of 2d-array
     * Function parameters:
     * @param arr Reference to a two-dimensional array of ints
     */
    public static void printMaxArrays(int[][] arr) {
        System.out.println("Array of max");
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
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

        System.out.println("Result");
        String[] strArr = new String[rows];
        fillStringArray(strArr, intArr);
        sortStringArray(strArr);
        printArray(strArr);
    }
}
