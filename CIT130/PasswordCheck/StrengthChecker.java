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

/**
 * Uses 3 methods to determine if the user entered password meets
 * all requirements
 * setReqLength will set the length of the password
 * setReqChars will set the required Characters
 * checkPassword will check if password meets both requirements
 * @author zachboburka
 */
public class StrengthChecker {

    private int memMin;
    private int memMax;
    int criteria = 0;
    private String[] memReqChars;
    boolean reqLength;
    boolean reqChar;
    boolean reqCriteria;

    /**
     * Puts the values of min/max into memMin/memMax
     *
     * @param min : minimum password length
     * @param max : maximum password length
     */
    public void setReqLength(int min, int max) {   
        memMin = min;
        memMax = max;
    }//end SetReqLength     

    /**
     * Puts the value of reqChars into memReqChars
     *
     * @param reqChars : required characters
     */
    public void setReqChars(String[] reqChars) {
        memReqChars = reqChars;
    }//end setReqChars                

    /**
     * Determines if the entered password meets all requirements by checking the
     * value of reqCriteria
     *
     * @param enteredPassword : User entered password
     * @return
     */
    public boolean checkPassword(String enteredPassword) {

        //checks password length
        int length = enteredPassword.length();
            if (length >= memMin && length <= memMax) {
                reqLength = true;
                criteria = criteria + 1;
            } else {
                reqLength = false;
                criteria = criteria - 3;
            }//end if
        
        //checks password characters
        for (int i = 0; i < memReqChars.length; i++) {
            if (enteredPassword.contains(memReqChars[i])) {
                reqChar = true;
                criteria = criteria + 1;
            } else {
                reqChar = false;
                criteria = criteria + 0;
            }         
        }//end for
        
        //checks password requirements
        while (true) {
            if (criteria >= 2) {
                reqCriteria = true;
                System.out.println("Password meets all requirements, good job");
                break;
            } else {
                reqCriteria = false;
                System.out.println("Password does not meet criteria, please try again.");
                System.out.println(criteria);
                break;
            }//end if
        }//end loop
        return reqCriteria;
    }//end CheckPassword               
}//end class