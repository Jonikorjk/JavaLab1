package secondTask;
import java.util.Arrays;

public class Main {

    public static void printArray(int[] arr, boolean printNegative) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && printNegative) {
                System.out.print(arr[i] + " ");
            }
            if (arr[i] >= 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        final int negativeNumber = -1;

        int[] arr = new int[301]; // from 0 to 300
        Arrays.setAll(arr, i -> i);

        //printArray(arr, false);
        //System.out.println();

        arr[0] = negativeNumber;
        arr[1] = negativeNumber;

        for (int i = 2; i < arr.length; i++) {
            for (int j = 2; i * j < arr.length ; j++) {
                if (arr[i] < 0) break;
                arr[i * j] = negativeNumber;
            }
        }

       printArray(arr, false);
    }
}
