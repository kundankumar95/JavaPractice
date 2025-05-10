package com.kundan.Practice;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit of electricity used: ");
        int unit = scanner.nextInt();
        int bal = 0;

        if (unit <= 100) {
            bal = 0;
        } else if (unit <= 200) {
            bal = (unit - 100) * 5;
        } else {
            bal = 500 + (unit - 200) * 10;
        }

        System.out.println("Total bill: " + bal);

        scanner.close();
    }
}
