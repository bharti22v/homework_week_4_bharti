package week_4_homework;

import java.util.Scanner;

public class Program_12_Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        if(isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
