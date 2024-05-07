package week_4_homework;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Program_9_FibonacciSequence {
    public static void main(String[] args) {
        int n = 8; // Number of terms in the sequence

        System.out.println("Fibonacci sequence up to " + n + " terms:");
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int firstTerm = 1;
        int secondTerm = 1;

        // Print the first two terms
        System.out.print(firstTerm + " " + secondTerm + " ");

        // Loop to generate and print the rest of the terms
        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}