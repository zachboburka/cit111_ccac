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
import java.util.Scanner;
/**
 * This program creates a text based interface to replicate a Dairy Queen 
 * menu. The user is given a menu of 4 items and prompted to choose which item
 * they would like to order. Each item has an individual price and is totaled 
 * at the end of the order. The number of orders and total revenue is also
 * tracked and displayed.
 * @author zachary.boburka
 */
public class DairyQueen {
    //cash register for dairy queen
    //values for  variables revenue and orders
    static double revenue = 0;
    static double orders = 0;
    
    final static double BLIZZARD_PRICE = 3.00;
    final static double CONE_PRICE = 1.50;
    final static double CAKE_PRICE = 10.00;   
    final static double SMOOTHIE_PRICE = 2.50;
    
    
    public static void main(String[] args){
        while(true){
        //welcome the customer, give the menu, take the order
        System.out.println("Welcome to Dairy Queen");
        System.out.println("***************************");
        System.out.println("MENU : ");
        System.out.println("1 : Oreo Blizzard");
        System.out.println("2 : Vanilla Cone");
        System.out.println("3 : Ice Cream Cake");
        System.out.println("4 : Orange Julius");
        System.out.println("***************************");
        System.out.println("What Number You Like To Order?");
        
        //scanner to take order
        Scanner scanOrder = new Scanner(System.in);
        int order = scanOrder.nextInt();
        
        //print
        if(order == 1){
        oreoBlizzard(order);
                printStats();

        }
        
        if(order == 2){
        vanillaCone(order);
                printStats();

        }
        
        if(order == 3){
        cake(order);
                printStats();

        }
        
        if(order == 4){
        orangeJulius(order);
                printStats();

        }
            System.out.println("Would you like anything else?, Yes or No.");
            Scanner scanFinish = new Scanner(System.in);
        String finish = scanFinish.next();
        if(finish.equals("Yes") )
        { System.out.println("What would you like to order?");            
            } else {
            System.out.println("Thanks, have a good one.");
                break;
            }//close if/else
        
        }//close while
    }//close main

        public static double oreoBlizzard(int order) {           
            System.out.println("Making Blizzard");            
            revenue = revenue + BLIZZARD_PRICE;
            orders = orders + 1;            
        return orders;     
        
        }//close oreoBlizzard
    
    
            public static double vanillaCone(int order) {
                System.out.println("Making Cone");
                revenue = revenue + CONE_PRICE;
                orders = orders + 1;            
            return orders;
            }//close vanillaCone
    
                public static double cake(int order) {
                    System.out.println("Making Cake");                
                    revenue = revenue + CAKE_PRICE;
                    orders = orders + 1;       
                return orders;
                }//close cake
                
                
                    public static double orangeJulius(int order) {
                        System.out.println("Making Smoothie");                   
                        revenue = revenue + SMOOTHIE_PRICE;
                        orders = orders + 1;                   
                    return orders;                    
                    }//close orangeJulius
                    
                        public static void printStats() {
                            System.out.println(" ");
                            System.out.println("******Stats******");
                            System.out.println("Total Revenue : " + revenue);
                            System.out.println("Total Orders : " + orders);
                            System.out.println("*****************");
                        }//close printStats
}//close class