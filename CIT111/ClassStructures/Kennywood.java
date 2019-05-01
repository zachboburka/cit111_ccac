/*
 * MIT License

Copyright (c) [2019] [Zach Boburka]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package ClassStructures;

import java.util.Random;
import java.util.Scanner;

/**
 * This program lets the user select the number of riders he wants to test and 
 * the average height of each rider. The program then displays how many
 * riders got sick during the ride and how many failed ride attempts happened.
 * @author zachary.boburka
 */
public class Kennywood {

    //final ints for the minimum height a rider 
    //must be for thrill and theme rides
    //ints
    static int totalRiders = 0;
    static int failedRideAttempts = 0;
    static int sickRiders = 0;

    //final ints
    final static int MINHEIGHT_THRILL = 60;
    final static int MINHEIGHT_THEME = 48;

    //main
    public static void main(String[] args) {

        System.out.println("Begin Ride Simulation");
        //get the number of riders from the user
        System.out.println("Enter the number of riders ;");
        Scanner ScanRiders = new Scanner(System.in);
        int groupSize = ScanRiders.nextInt();

        //do the riders meet the height requirement    
        System.out.println("Enter the average height of the riders :");
        Scanner ScanHeight = new Scanner(System.in);
        int height = ScanHeight.nextInt();

        //formatting
        System.out.println(" ");

        //get calculations
        rideBlackWidow(groupSize, height);

        //print stats
        printRideStats();

        rideMerryGoRound(groupSize, height);

        //print ride stats
        printRideStats();

    }//close main

    public static int rideBlackWidow(int groupSize, int height) {

        if (height >= MINHEIGHT_THRILL) {
            System.out.println("Riding Black Widow...");
            totalRiders = totalRiders + groupSize;
            Random rand = new Random();
            sickRiders = rand.nextInt(groupSize);

        } else {
            System.out.println("Riders turned away!! Too short!!");
            failedRideAttempts = failedRideAttempts + groupSize;
        }
        return totalRiders;
    }//end rideBlackWidow

    public static int rideMerryGoRound(int groupSize, int height) {
        if (height >= MINHEIGHT_THEME) {
            System.out.println("Riding MerryGoRound...");
            totalRiders = totalRiders + groupSize;
            Random rand = new Random();
            sickRiders = rand.nextInt(groupSize);

        } else {
            System.out.println("Riders turned away!! Too short!!");
            failedRideAttempts = failedRideAttempts + groupSize;
        }
        return totalRiders;
    }//end rideMerryGoRound

    public static void printRideStats() {
        System.out.println(" ");
        System.out.println("*******RIDER STATS*******");
        System.out.println("Total Riders: " + totalRiders);
        System.out.println("Total Failed Ride Attempts: " + failedRideAttempts);
        System.out.println("Total Sick Riders: " + sickRiders);
        System.out.println("*************************");
        System.out.println(" ");
    }//end printRideStats

}//close class

