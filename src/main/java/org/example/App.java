package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.time.Year;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        //records current year
        int yearNow = Year.now().getValue();

        //record current age from user
        System.out.println("What is your current age?");
        String ageString = sc.next();
        int age = Integer.parseInt(ageString);

        //record retirement age from user
        System.out.println("At what age would you like to retire?");
        String retireString = sc.next();
        int retire = Integer.parseInt(retireString);

        //output 1, stating years until retirement
        System.out.println("You have " + (retire - age) + " years left until you can retire.");

        //output 2, stating current year and retirement year
        System.out.println( "It's " + yearNow + ", so you can retire in " + (yearNow + retire - age));
    }
}
