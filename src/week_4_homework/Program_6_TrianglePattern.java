package week_4_homework;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number For e.g.
 *  Input number of rows: 10
 */

public class Program_6_TrianglePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            int num = 1;
            // Print numbers for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
