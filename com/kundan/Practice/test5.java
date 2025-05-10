package com.kundan.Practice;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0 && num % 5 == 0) {
            System.out.println(num + " is positive and divisible by 5");
        } else {
            System.out.println(num + " is not positive and divisible by 5");
        }

        scanner.close();
    }
}

