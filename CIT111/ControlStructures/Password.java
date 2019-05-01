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
 * This program gives the user 3 chances to enter the correct password. If the 
 * user enters the correct password, they see "the meaning of life" and are
 * asked if they want to change the password. If the wrong password is entered,
 * the program ends. The default password is "password".
 * @author zachary.boburka
 */
public class Password {
        public static void main(String[] args) {
            //intro
            System.out.println("***Authenticator Revisted***");
            
            //strings
            String password = "password";
            String enteredPassword;
            String change;
            String newPassword;
            
            //ins
            int limit = 3;
            int entries = 0;
            
            while(true){
            //ask user to enter password
            System.out.println("Enter the system password to learn the protected information");
            
            //scanner
            Scanner ScanPassword = new Scanner(System.in);
            enteredPassword = ScanPassword.next();
            
            
            //if statement
            if(enteredPassword.equals(password)){
                entries = entries + 1;
                System.out.println("Correct Password!");
                System.out.println("****************************");
                System.out.println("Your Secret is : The meaning of life is (100 % 2) * 9 + 1!");
                System.out.println("****************************");
                System.out.println(" ");

                    //Changing Password
                    System.out.println("Would you like to change the password?? yes or no??");
                
                    //New Scanner
                    Scanner ScanChange = new Scanner(System.in);
                    change = ScanChange.next();
                    //if statement if the user wants to change password
                    if(change.equals("yes")){
                    
                        //newer scanner
                        System.out.println("What would you like to change it to?");
                        password = ScanPassword.next();
                        //printout what the new password is
                        System.out.println("You entered " + password);
                    //if the user does not want to change the password
                    } else { 
                        break;
                    }//close else
                    
            //if the user enters the wrong password    
            } else { 
                entries = entries + 1;
                System.out.println("Incorrect password, try again:");
                System.out.println("Number of attempts: " + entries);
                System.out.println("Number of attempts allowed: " + limit);
                System.out.println("Please try again: ");
                //if the user enters too many wrong passwords
                    if (entries > limit) {
                        System.out.println("Incorrect password, too many attempts.");
                        System.out.println("Number of attempts: " + entries);
                        System.out.println("Number of attempts allowed: " + limit);
                        System.out.println("Locked out.");
                        break;
                    }//close if
                }//close else
            }//close while  
        }//close class
}//close class