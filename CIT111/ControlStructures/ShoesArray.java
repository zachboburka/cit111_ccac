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
package ControlStructures;

import java.util.Scanner;

/**
 * This program was used to practice creating and storing information in arrays. 
 * A string with 5 different shoe models was created, along with a for loop. 
 * The user is prompted with the choice of selecting a shoe, through input of
 * numbers 0-4. A for loop takes in the user's input and selects the chosen shoe
 * inside the array.
 * @author zachary.boburka
 */
public class ShoesArray {

    public static void main(String[] args) {
        //create an array object that stores only strings
        // and stores a reference to that array in the variable books
        //shoes
        String[] shoes = new String[5];

        shoes[0] = "Jordan 4 : Cactus Jack";
        shoes[1] = "Air Max 1 : Animal Pack";
        shoes[2] = "Jordan 1 : Top 3";
        shoes[3] = "Yeezy 700 : Waverunner";
        shoes[4] = "Jordan 1 : Off-White UNC";

        //for loop
        for (int i = 0; i <= 4; i = i + 1) {
            String accessedShoe = shoes[i];
            System.out.println("Accessed shoe : " + accessedShoe);
        }//end for

        //user interaction
        System.out.println("Pick a Shoe");

        int shoePicked;

        //scanner
        Scanner ScanShoe = new Scanner(System.in);
        shoePicked = ScanShoe.nextInt();

        //prints shoe picked
        System.out.println(shoes[shoePicked]);

    }//end main
}//end class
