package week_4_homework;

import java.util.Scanner;

public class Program_14_DiamondPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();
        scanner.close();

        if (rows % 2 == 0) {
            System.out.println("Please enter an odd number of rows.");
            return;
        }

        int spaces = rows / 2;
        int stars = 1;
        int row = 1;

        while (row <= rows) {
            // Print spaces
            int count = 1;
            while (count <= spaces) {
                System.out.print(" ");
                count++;
            }

            // Print stars
            count = 1;
            while (count <= stars) {
                System.out.print("*");
                count++;
            }

            // Move to the next line
            System.out.println();

            // Update spaces and stars for the next row
            if (row <= rows / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            row++;
        }
    }
}
