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
package Objects;
import java.util.Random;

/**
 * 
 * @author zachary.boburka
 */
public class Donut {
    //member variables
    private int percRemaining = 100;
    String type;
    String size;
    boolean messy;
    
    public int simulateEating() {
        //calculate the amount of the donut left
        System.out.println("Taking a bite...");
        Random rand = new Random();
            int randBiteSize = rand.nextInt(percRemaining);
                percRemaining = percRemaining - randBiteSize;
    
                
        //if statement to ensure that percentage remaining is not negative.
        if(percRemaining < 0){
            percRemaining = 0;
        }//close if
                
        return percRemaining;
    }// close simulateEating
        
    
    //method showing the amount of the donut left
    public int getPercRemaining(){
        //send back the amount remaining after a bite is taken
        return percRemaining;
    }//close getPercRemaining
    
    public static void main(String [] args) {
        
        
        
        
    }//close main
    
}//close class