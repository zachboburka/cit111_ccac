/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjects;


/**
 *
 * @author zachary.boburka
 */
public class skatePark {
    
    public static void main(String[] args) {
        //introducing skatboard 1
        
        //skateboard 1
        System.out.println("**** First Skateboard ****");
        Skateboard firstSkateboard = new Skateboard();
        firstSkateboard.brand = "AntiHero";
        firstSkateboard.size = 8.12;
        firstSkateboard.trickName = "Kickflip";
        firstSkateboard.doTrick();
        firstSkateboard.getTrickHeight();
        
        System.out.println("firstSkateboard's brand : " + firstSkateboard.brand);
        System.out.println("firstSkateboard's size : " + firstSkateboard.size + " inches");
        System.out.println("Doing Trick...     ");
        System.out.println("firstSkateboard's trick landed : " + firstSkateboard.trickLanded);
        System.out.println("firstSkateboard's trick : " + firstSkateboard.trickName);        
        System.out.printf("firstSkateboard's trick height : %.2f feet high ", firstSkateboard.trickHeight);
        System.out.println("");
        System.out.println("********************************************************************************");
        System.out.println("");
        
        
        //skateboard 2
        System.out.println("**** Second Skateboard ****");
        Skateboard secondSkateboard = new Skateboard();
        secondSkateboard.brand = "Palace Skatebords";
        secondSkateboard.size = 8.25;
        secondSkateboard.trickName = "Pop Shuvit";
        secondSkateboard.doTrick();
        secondSkateboard.getTrickHeight();

        System.out.println("secondSkateboard's brand : " + secondSkateboard.brand);
        System.out.println("secondSkateboard's size : " + secondSkateboard.size + " inches");
        System.out.println("Doing Trick...     ");
        System.out.println("secondSkateboard's trick landed : " + secondSkateboard.trickLanded);
        System.out.println("secondSkateboard's trick : " + secondSkateboard.trickName);
        System.out.printf("secondSkateboard's trick height : %.2f feet high ", secondSkateboard.trickHeight);
        System.out.println("");
        System.out.println("********************************************************************************");
        System.out.println("");
                
        //skateboard 3
        System.out.println("**** Third Skateboard ****");
        Skateboard thirdSkateboard = new Skateboard();
        thirdSkateboard.brand = "Palace Skatebords";
        thirdSkateboard.size = 8;
        thirdSkateboard.trickName = "Tre Flip";
        thirdSkateboard.doTrick();
        thirdSkateboard.getTrickHeight();

        System.out.println("thirdSkateboard's brand : " + thirdSkateboard.brand);
        System.out.println("thirdSkateboard's size : " + thirdSkateboard.size + " inches");
        System.out.println("Doing Trick...     ");
        System.out.println("thirdSkateboard's trick landed : " + thirdSkateboard.trickLanded);
        System.out.println("thirdSkateboard's trick : " + thirdSkateboard.trickName);
        System.out.printf("thirdSkateboard's trick height : %.2f feet high ", thirdSkateboard.trickHeight);
        System.out.println("");
        System.out.println("********************************************************************************");
        System.out.println("");

    }//end main
}//end class
