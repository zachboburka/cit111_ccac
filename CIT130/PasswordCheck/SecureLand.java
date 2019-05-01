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
package PasswordCheck;
import java.util.Scanner;

/**
 *
 * @author zachboburka
 */
public class SecureLand {
    

    
    public static void main(String[] args) {

        /**
         * Prints instructions, creates scanner, and takes user input
         */
        System.out.println("Enter a Password, Password must be at or between 8 to 50 characters and contain an @ or !.");
        Scanner ScanPassword = new Scanner(System.in);
        String enteredPassword = ScanPassword.next();
        StrengthChecker sc = new StrengthChecker();
        String[] reqChars = {"@", "!", "#"};

        /**
         * Checks if the password meets the length requirement
         */
        sc.setReqLength(8, 50);
        
        /**
         * Checks if the password meets the character requirement
         */
        sc.setReqChars(reqChars);
        
        /**
         * Checks if the password meets all requirements
         */
        sc.checkPassword(enteredPassword);
        
    }//end main
}//end class