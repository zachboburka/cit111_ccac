/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjects;
import java.util.Random;

/**
 *
 * @author zachary.boburka
 */
public class Skateboard {
//member variables

//width of the skateboard in inches
    double size;
//conditon of the skateboard, when it breaks the program ends
    private int lifeRemaining = 100;
//brand of the skateboard
    String brand;
//name of the trick
    String trickName;
//height of the trick
    double trickHeight;
//did you land the trick?
    boolean trickLanded;

    
//method about tricks, will take in trick name, height, and whether or not you land it
    public int doTrick() {
        //do a trick and figure out the trick type, height, and whether or not you land it
        
        //did you land the trick?
        Random rand = new Random();
        if (rand.nextDouble() < 0.75) { trickLanded = true;// <-- 75% of the time.
        } else { trickLanded = false; 
        }//end if/else
               
    
    
        
        
        
    return lifeRemaining;
}//end doTrick
    
    public double getTrickHeight(){
        
     trickHeight = (Math.random()*((3-1)+1))+1;
    return trickHeight;
    }
    
   
    
   
    

    
    
}//end class
