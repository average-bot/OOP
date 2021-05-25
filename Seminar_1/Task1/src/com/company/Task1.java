package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // ask the user how many books they want to be shipped
        System.out.println("Welcome\n\nHow many books would you like to ship? :  ");
        Scanner input = new Scanner(System.in);
        int NumberOfBooks = -1;
        // check for lower than 0
        while (NumberOfBooks <= 0) {
            try {
                NumberOfBooks = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Please enter a whole number that is bigger than 0.");
                input.next();
            }
            if (NumberOfBooks == 0) {
                System.out.print("Please enter a while number  that is bigger than 0.");
            }
        }
        calculations(NumberOfBooks);
    }

    public static void calculations(int NumberOfBooks){
        int BoxYN;
        int Shipping;
        // calculate boxes
        int NoBoxes = NumberOfBooks / 5;
        // check for extra box
        double NoBoxReal = NumberOfBooks / (double)5;
        // difference
        if (NoBoxes != NoBoxReal) {
            NoBoxes += 1;
        }
        // total books
        int SingleBox = NumberOfBooks % 5;
        if (SingleBox >0) {
            BoxYN = 1;
            NoBoxes -=1;}
        else {
            BoxYN = 0;
        }
        // defining shipping prices
        if (NoBoxes < 6 && NoBoxes >= 0) {
            Shipping = 8; }
        else {
            Shipping = 5;
        }
        // calculating shipping prices
        int ShippingFee = (NoBoxes+BoxYN) * Shipping;

        // print it   - ADD THE VARIABLES
        if (BoxYN == 0) {
            if (NoBoxes == 1) {
                System.out.println("You will receive " + NoBoxes + " box containing 5 books. ");
            }
            else {
                System.out.println("You will receive " + NoBoxes + " boxes containing 5 books. ");
            }
        }
        else {
            if(NoBoxes == 2) {
                System.out.println("You will receive " + NoBoxes + " boxes containing 5 books and " + BoxYN +
                        " box containing " + SingleBox + " books. ");
            }
            else {
                if(NoBoxes == 0) {
                    System.out.println("You will receive "+ BoxYN +
                            " box containing " + SingleBox + " books. ");
                }
                else {
                    System.out.println("You will receive " + NoBoxes + " box containing 5 books and " + BoxYN +
                            " box containing " + SingleBox + " books. ");
                }
            }
        }
        System.out.println("The shipping price will be : " + ShippingFee +" sek");
    }  }

