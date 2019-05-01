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

import java.util.LinkedList;

/**
 * this program will take computer components and human interest components and
 * will print specifics about the component, then put it on a time line.
 *
 * @author zachary.boburka
 */

/*
    Parent Class named component will store member variables for the
    component's name, author, project name, and description, along with 
    a method to determine how long ago it happened.
 */
public class TimelineClient {

    public static void main(String[] args) {
        Component[] compArr = new Component[1];
        compArr[0] = new ComputerComponent();

        LinkedList<Component> timelineList = new LinkedList<>();
        //iterate over the array: visit each shelf,
        //extract item, then add to CollectionClass
        for (int i = 0; i < compArr.length; i++) {
            timelineList.add(compArr[i]);
        }
        //alternatively, we can do some fancy magic

//        timelineList.addAll(java.util.Arrays.asList(compArr))
        System.out.println("Pick a Component");
        int compPicked;

        //scanner
        Scanner ScanComp = new Scanner(System.in);
        compPicked = ScanComp.nextInt();

        //prints comp picked
        System.out.println(compArr[compPicked]);
        Scanner ScanComponent = new Scanner(System.in);

        //user interaction
        

        //if human interest component is chosen
        
    }//end main
}//end Timeline