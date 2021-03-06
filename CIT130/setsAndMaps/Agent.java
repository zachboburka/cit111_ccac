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
package SetsAndMaps;


/**
 * Program creates agents and assigns them with an ID Number and Stealth Rating
 * Each agent is deployed randomly to one of four countries and their stealth
 * rating is compared to the respective country's which will reveal whether or
 * not they are still undercover
 *
 * @author zachboburka
 */
public class Agent {

    AgentLand gen1 = new AgentLand();

    /**
     * Agent Factory Creates agents using a for loop Number of agents can be
     * edited by changing the object and for loop Each agent is given an ID
     * Number and a Stealth Rating Stealth Rating is used to determine the
     * agent's cover status
     */
    public void GenAgent() {

        gen1.SetID();
        gen1.SetStealth();

        System.out.println("");
        System.out.println("Agent ID : " + gen1.GetID());
        System.out.println("Stealth Rating : " + gen1.GetStealth());
        System.out.println(gen1.IsCoverBlown());

    }

    public void PrintStatus() {
        //Prints out number of agents undercover and compromised

        System.out.println("");
        System.out.println("Agent Totals : ");
        System.out.println("Number of agents undercover : " + gen1.UnderListPrint());
        System.out.println("Number of agents compromised : " + gen1.CompListPrint());
    } // end printStatus

}//end Agent