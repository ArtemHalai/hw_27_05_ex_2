package com.epam.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number you want to change sign: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        changeSign(number);
    }

    private static void changeSign(int number) {
        System.out.println(~number+1);
    }
}
