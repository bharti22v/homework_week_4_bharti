package week_4_homework;
import java.util.Scanner;

/**
 * -Use the has NextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be entered number #1:, the next Enter number
 * #2:,
 */

public class Program_1_TenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            int order = count + 1;
            System.out.print("Enter number #" + order + ": ");

            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            sc.nextLine(); // handle newline character after nextInt()
        }

        System.out.println("Sum of the 10 numbers is: " + sum);
        sc.close();
   }
}


