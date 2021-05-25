package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Welcome\nThis program will input as many numbers as you'd like ");
        System.out.println("and output the lowest number from the input.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number or finish with 0.");
        int NewNumber = 1;
        boolean done = false;
        while (done != true) {
            try {
                NewNumber = input.nextInt();
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter an actual number. ");
                input.next();
            }
        }

        int Compare = NewNumber;

        while (NewNumber != 0) {
            System.out.println("Please enter a number or finish with 0.");
            try {
                NewNumber = input.nextInt();
                if (NewNumber != 0) {
                    Compare = Math.min(Compare, NewNumber);
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter an actual number. ");
                input.next();
            }
        }


        System.out.println("\nThe lowest number entered was " + Compare);
    }

    }

