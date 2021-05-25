package com.company;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the average speed in km/h: ");
        int speed = input.nextInt();
        System.out.println("Please enter the remaining mileage in miles: ");
        int miles = input.nextInt();
        int minutes = 0;
        int hours = 0;
        double conversion = 1.60934;
        double km = miles * conversion;
        double TimeInSec = (km/speed)*3600;
        while (TimeInSec > 60) {
            minutes += 1;
            TimeInSec -=60; }
        while (minutes > 60){
            hours +=1;
            minutes -= 60;}
        System.out.println("The time left is "+hours+" hours, "+minutes+" minutes and "+Math.round(TimeInSec)+" seconds. ");

    }
}
