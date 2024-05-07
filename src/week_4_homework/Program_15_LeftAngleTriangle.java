package week_4_homework;

/**
 *  Display left angle triangle of * using nested for loops
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */

public class Program_15_LeftAngleTriangle {


    public static void main(String[] args) {
        int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
