package week_4_homework;

import java.util.Scanner;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */

public class Program_11_EvenDigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Sum of even digits: " + getEvenDigitSum(number));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // return -1 for negative numbers
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10; // get the last digit
            if (digit % 2 == 0) {    // check if it's even
                sum += digit;        // add it to the sum
            }
            number /= 10;            // move to the next digit
        }

        return sum;
    }

}
