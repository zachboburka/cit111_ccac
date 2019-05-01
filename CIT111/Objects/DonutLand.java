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

/**
 * This program was made to practice creating and using objects. DonutLand is
 * the client file that uses object Donut to generate 3 donuts. Each donut is
 * given individual attributes for its type, size, messiness, and percentage 
 * remaining after running a method that simulates a bite.
 * @author zachary.boburka
 */
public class DonutLand {
    
    public static void main(String[] args) {
        //interstating a new donut
        
        //first Donut
        Donut firstDonut = new Donut();
        firstDonut.type = "powder";
        firstDonut.size = "medium";
        firstDonut.messy = true;
        firstDonut.simulateEating();
        firstDonut.getPercRemaining();
        
        System.out.println("firstDonut's type : " + firstDonut.type);
        System.out.println("firstDonut's size : " + firstDonut.size);
        System.out.println("firstDonut's messyness : " + firstDonut.messy);
        System.out.println("firstDonut's percent remaining : " + firstDonut.getPercRemaining() + "%");
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("");
        //second Donut
        Donut secondDonut = new Donut();
        secondDonut.type = "chocolate";
        secondDonut.size = "medium";
        secondDonut.messy = false;
        secondDonut.simulateEating();
        secondDonut.getPercRemaining();

        System.out.println("secondDonut's type : " + secondDonut.type);
        System.out.println("secondDonut's size : " + secondDonut.size);
        System.out.println("secondDonut's messyness : " + secondDonut.messy);
        System.out.println("secondDonut's percent remaining : " + secondDonut.getPercRemaining() + "%");
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("");
        
        //third Donut
        Donut thirdDonut = new Donut();
        thirdDonut.type = "cinnamon";
        thirdDonut.size = "medium";
        thirdDonut.messy = true;
        thirdDonut.simulateEating();
        thirdDonut.getPercRemaining();
        
        System.out.println("thirdDonut's type : " + thirdDonut.type);
        System.out.println("thirdDonut's size : " + thirdDonut.size);
        System.out.println("thirdDonut's messyness : " + thirdDonut.messy);
        System.out.println("thirdDonut's percent remaining : " + thirdDonut.getPercRemaining() + "%");
        System.out.println("");
        System.out.println("**************************************************");
        System.out.println("");
    }//close main
    
}//close class