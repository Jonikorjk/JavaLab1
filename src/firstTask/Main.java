package firstTask;

import java.util.Random;

// 13 v

public class Main {

   public static char fillChar = '$';
    public static void fill2DArray(int[][] arr)
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(5, 22);
            }
        }
    }

    public static void main(String[] args)
    {
        Random rand = new Random();

        // 5 7 9 11 13 15 17 19 21
        int[][] arr = new int[3][3];
        fill2DArray(arr);


        String[] strArr = new String[];
    }
}

