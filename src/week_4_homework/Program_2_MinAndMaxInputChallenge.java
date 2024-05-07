package week_4_homework;
import java.util.Scanner;

/**
 * the first message printed to the user would be entered number #1:, the next Enter number
  #2:, and so on.
 */

public class Program_2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0; // Initialize min to hold the minimum value
        int max = 0; // Initialize max to hold the maximum value
        boolean firstNumber = true; // Flag to track if it's the first number entered

        while (true) {
            System.out.print("Enter number: ");
            if (sc.hasNextInt()) {
                int number = sc.nextInt();

                // If it's the first number entered, assign it to both min and max
                if (firstNumber) {
                    min = number;
                    max = number;
                    firstNumber = false;
                } else {
                    // Update min and max based on the newly entered number
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                }
            } else {
                System.out.println("Invalid input. Exiting loop.");
                break;
            }
            sc.nextLine(); // handle newline character after nextInt()
        }

        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);

        sc.close();
    }
}
