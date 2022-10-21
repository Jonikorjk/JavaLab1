package thirdTask;

public class Main {
    private static long[] fib_table = new long[92];
    private static boolean isFirstTime = true;

    public static long fib_num(int num) {
        if (num > 92 && num <= 0) {
            System.out.println("Error, num must be  0 < num <= 92");
            return -1;
        }

        if (isFirstTime) {
            fib_table[0] = 1; fib_table[1] = 1;
            isFirstTime = false;
        }

        if (fib_table[num - 1] <= 0) {
            fib_table[num - 1] = fib_num(num - 1) + fib_num(num - 2); // fib_table[n_num] = fib_num(num) ||||| n_num = num - 1
        }
        return fib_table[num - 1];
    }

    public static void main(String[] args) {
        System.out.println(fib_num(92));
        System.out.println(fib_num(12));
    }
}
