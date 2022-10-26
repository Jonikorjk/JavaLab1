package firstTask;

import java.util.*;

// 13 v

/**
 * <p>Main()</p>
 * Class for solving 1 task
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        final int rows = in.nextInt();
        final int cols = in.nextInt();

        if (rows <= 1 || cols <= 1) {
            System.out.println("Bad value of rows and cols");
            return;
        }
        StandardMethod sm = new StandardMethod();
        sm.start(rows, cols);

        System.out.println();

        ArraysClassMethod acm = new ArraysClassMethod();
        acm.start(rows, cols);
    }
}

