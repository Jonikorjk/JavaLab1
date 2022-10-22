package firstTask;

import java.util.*;

// 13 v

/**
 * <p>Main()</p>
 * Class for solving 1 task
 */
public class Main {

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
           arr[i] = rand.nextInt(5, 22);
       }
       return arr;
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
                arr[i][j] = rand.nextInt(5, 22);
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


    public static void main(String[] args)
    {
        // 5 7 9 11 13 15 17 19 21
       final int rows = 3, cols = 3;

        System.out.println("Standart way");

        int[][] intArr = new int[rows][cols];

        System.out.println("2D Array");
        fill2DArray(intArr);
        printArray(intArr);

        System.out.println("Reslut");
        String[] strArr = new String[cols];
        fillStringArray(strArr, intArr);
        sortStringArray(strArr);
        printArray(strArr);
    //////////////////////////////////////////////////


        System.out.println();
        System.out.println("class Array Way");
    //////////////////////////////////////////////////

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

