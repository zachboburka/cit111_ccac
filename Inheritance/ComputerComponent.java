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
package inheritance;

import java.util.Scanner;

/**
 *
 * @author zachary.boburka
 */
public class ComputerComponent extends Component {
    double price;
    double currentPrice;
    double inflationRate;
    int priceYear;
    String manufacturer;
    String modelName;
    String whyChoose;
    String yearEvent;

    
    //only pick manufacturer and modelName
    public double newPrice(double inflationRate) {

        //computer current price using inflation rate
        currentPrice = (price * inflationRate);

        return currentPrice;
    }//end inflation rate
    
    ComputerComponent() {
        
        Scanner ScanComponent = new Scanner(System.in);
        
        ComputerComponent userComputer = new ComputerComponent();

        System.out.println("Who was the author? ");
        userComputer.author = ScanComponent.nextLine();

        System.out.println("What is the model name? ");
        userComputer.modelName = ScanComponent.nextLine();

        System.out.println("Enter a brief description :  ");
        userComputer.description = ScanComponent.nextLine();

        System.out.println("Who is the manufacturer? ");
        userComputer.manufacturer = ScanComponent.nextLine();

        //print results
        System.out.println("");
        System.out.println("***Computer Component***");
        System.out.println("Author : " + userComputer.author);
        System.out.println("Model Name : " + userComputer.modelName);
        System.out.println("Description : " + userComputer.description);
        System.out.println("Manufacturer : " + userComputer.manufacturer);
        System.out.println("");
        
        
    }//end UserInput
}
