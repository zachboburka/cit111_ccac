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
package controlstructures;
    import java.util.Scanner;

/**
 * Friend Picker using
 * if statements
 * @author Zach Boburka
 */
public class MightWeBeFriends { 
    public static void main(String[] args){
        //Intro Statements
        System.out.println("Might We Be Friends?");
        System.out.println(" ");
        System.out.println("Answer using yes or no.");
        System.out.println(" ");
        
        //ints
        int earnedPoints = 0;
        
        //Strings
        String age;
        String hipHop;
        String videoGames;
        String skateboard;
        

        //Friend Picker
        
        System.out.println("Are you between the ages of 16 and 20?");
               
        Scanner ScanAge = new Scanner(System.in);
        age = ScanAge.next();
        
        if(age.equals("yes")){            
            earnedPoints = earnedPoints + 1;
            System.out.println("Great!");
        } else {
            earnedPoints = earnedPoints + 0;
            System.out.println("That's a shame.");
        } // Closes Question 1
        
        
            //Starts Question 2
            System.out.println("Do you like hip hop music?");
        
            Scanner ScanHipHop = new Scanner(System.in);
            hipHop = ScanHipHop.next();
        
            if(hipHop.equals("yes") ){            
                earnedPoints = earnedPoints + 1;
                System.out.println("Great!");
            } else {
                earnedPoints = earnedPoints + 0;
                System.out.println("That's a shame."); 
            } // Closes Question 2
        
            
            
                //Starts Question 3    
                System.out.println("Do you play video games?");
                
                Scanner ScanVideoGames = new Scanner(System.in);
                videoGames = ScanVideoGames.next();
                
                if(videoGames.equals("yes") ){            
                    earnedPoints = earnedPoints + 1;
                  
                } else {
                    earnedPoints = earnedPoints + 0;
                    System.out.println("That's a shame."); 
                } // Closes Question 3
        
                    //Starts Question 4
                    System.out.println("Do you like to Skateboard?");

                    Scanner ScanParty = new Scanner(System.in);
                    skateboard = ScanParty.next();
                
                    if(skateboard.equals("yes")){            
                        earnedPoints = earnedPoints + 1;
                        System.out.println("Great!");
                    } else {
                        earnedPoints = earnedPoints + 0;
                        System.out.println("That's a shame.");   
                    } //Closes Question 4
                    
                    
        //Output
        System.out.println("Final point total : " + earnedPoints);
        
        if (earnedPoints >= 2 ) {
            System.out.println("Sick, We Might Be Friends!");  
        } else {
            System.out.println("Damn, We Probably Won't Be Friends");
        } //Closes Output
        
    } //Closes Main
} //Closes Class