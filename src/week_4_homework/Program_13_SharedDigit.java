package week_4_homework;

import java.util.Scanner;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 */

public class Program_13_SharedDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (between 10 and 99): ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number (between 10 and 99): ");
        int number2 = scanner.nextInt();
        scanner.close();

        if (hasSharedDigit(number1, number2)) {
            System.out.println("The numbers have a shared digit.");
        } else {
            System.out.println("The numbers do not have a shared digit.");
        }
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (!isValid(number1) || !isValid(number2)) {
            return false; // return false if either number is not within the range
        }

        int digit1;
        int digit2;

        while (number1 > 0) {
            digit1 = number1 % 10; // extract digit from number1
            int temp = number2;
            while (temp > 0) {
                digit2 = temp % 10; // extract digit from number2
                if (digit1 == digit2) {
                    return true; // if a shared digit is found, return true
                }
                temp /= 10;
            }
            number1 /= 10;
        }

        return false; // no shared digit found
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 99); // check if number is within the range 10-99
    }
}