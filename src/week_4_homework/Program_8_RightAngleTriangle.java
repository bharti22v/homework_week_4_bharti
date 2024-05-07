package week_4_homework;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 */

public class Program_8_RightAngleTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
