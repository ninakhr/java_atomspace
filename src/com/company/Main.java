package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("First task.");
        for (int i = 5; i > 0; i--) {
            System.out.println(i + " ");
        }

        System.out.println("Second task.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum += i;
        }
        System.out.println(sum);
    }

}