package com.java.intervew.stream;

import java.util.Scanner;

public class Test {
    //371
    //cube of 3 + cube of 7 + cube of 1 = 371
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    private static boolean isArmstrong(int num) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = num;

        // Count the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = num;

        // Calculate the sum of nth power of each digit
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if the result is equal to the original number
        return result == num;
    }
}
