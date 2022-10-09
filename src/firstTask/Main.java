package firstTask;

import java.util.Random;

// 13 v

public class Main {

   final public static char fillSymbol = '$';

   public static void printArray(int[][] intArray)
   {
       for (int i = 0; i < intArray.length; i++) {
           for (int j = 0; j < intArray[i].length; j++) {
               System.out.print(intArray[i][j] + " ");
           }
           System.out.print("\n");

       }
   }
   public static void printArray(String[] stringArray)
   {
       for (int i = 0; i < stringArray.length; i++) {
           System.out.println(stringArray[i]);
       }
   }
   public static void fillStringArray(String[] stringArr, int[][] intArray)
   {
       for (int i = 0; i < stringArr.length; i++) {
           stringArr[i] = "";
       }
       for (int i = 0; i < stringArr.length; i++) {
           for (int j = 0; j < getMinOfRow(intArray,i); j++) {
               stringArr[i] += fillSymbol;
           }
       }
   }
    public static void fill2DArray(int[][] arr)
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(5, 22);
            }
        }
    }

    public static int getMinOfRow(int[][] arr, int row)
    {
        if (row < 0 || row > (arr[0].length - 1)) {
            return -1;
        }
        int min = arr[0][row];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i][row]) {
                min = arr[i][row];
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        int rows = 3, cols = 3;

        // 5 7 9 11 13 15 17 19 21
        int[][] intArr = new int[rows][cols];
        fill2DArray(intArr);
        printArray(intArr);

        String[] strArr = new String[cols];
        fillStringArray(strArr, intArr);
        printArray(strArr);
    }
}

