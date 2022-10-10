package firstTask;

import java.util.Random;
import java.util.Arrays;

// 13 v

public class Main {

   final public static char fillSymbol = '$';

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
    * Перегруженная функция, которая используется для того, чтобы вывести в стандартный поток вывода
    * Параметры функции:
    * @param intArray Ссылка, на двумерный массив целых чисел
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
     * Перегруженная функция, которая используется для того, чтобы вывести в стандартный поток вывода
     * Параметры функции:
     * @param stringArray Ссылка, на одномерный массив строк
     */
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

    public static int randomValueFromFiveToTwentyOne(Random random) {
       return random.nextInt(5, 22);
    }

    public static void main(String[] args)
    {
        // 5 7 9 11 13 15 17 19 21
       final int rows = 3, cols = 3;

        int[][] intArr = new int[rows][cols];
        fill2DArray(intArr);
        printArray(intArr);

        String[] strArr = new String[cols];
        fillStringArray(strArr, intArr);
        sortStringArray(strArr);
        printArray(strArr);

    //////////////////////////////////////////////////
        Random rand = new Random();

        int[][] s_intArr = new int[rows][cols];
        String[] s_strArr = new String[cols];

        //Arrays.setAll(s_intArr, );

        //Arrays.fill(s_strArr, )

        //printArray(s_intArr);



    }
}

