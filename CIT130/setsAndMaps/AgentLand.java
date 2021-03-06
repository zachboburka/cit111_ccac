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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Client application for Agent Each Agent's ID Number, Stealth Rating, and
 * cover status is printed
 *
 * @author zachboburka
 */
public class AgentLand {

    Map<Integer, Agent> mapAgent = new HashMap();

    public static int count = 0;
    int idNum = 10000;
    int agentsCompromised;
    int agentsInCover;
    int underList;
    int compList;
    double countryStealth;
    double stealthiness;
    boolean secretCoverUpheld;

    //Lists containing number of undercover and compromised agents
    List undercoverList = new ArrayList();
    List compromisedList = new ArrayList();

    /**
     * Sets and gets the ID Number for each Agent ID is set by a counter going
     * up to 10000
     */
    public void SetID() {
        idNum = count++;

    } // end SetID

    public int GetID() {
        mapAgent.get(idNum);
        return idNum;

    } //end GetStealth

    /**
     * Sets and gets the stealth rating for each Agent Stealth is set by setting
     * stealthSet to a random double
     */
    public void SetStealth() {
        Random r = new Random();
        stealthiness = r.nextDouble();

    } //end SetStealth

    public double GetStealth() {
        mapAgent.get(stealthiness);
        return stealthiness;

    } //end GetStealth

    public boolean IsCoverBlown() {
        /**
         * HashMap containing a country and the country's stealth rating
         */
        Map<String, Double> countryMap = new HashMap<String, Double>();
        countryMap.put("UK ", 0.2);
        countryMap.put("Iran ", 0.92);
        countryMap.put("China ", 0.85);
        countryMap.put("Japan ", 0.3);

        //Assigns each agent a country
        Object[] pickLocation = countryMap.keySet().toArray();
        Object key = pickLocation[new Random().nextInt(pickLocation.length)];
        System.out.println("Location : " + key + countryMap.get(key));

        /**
         * If statement deciding agent's cover status if the agents stealth
         * rating is greater than the country's stealth rating, then they remain
         * in cover Their cover will be blown if their stealth rating is less
         * than the country's stealth rating Planned to add a final output that
         * would display how many agents are undercover/compromised but haven't
         * gotten it to work
         */
        if (stealthiness > countryMap.get(key)) {
            undercoverList.add(idNum);
            System.out.println("Agent is still in cover.");
            secretCoverUpheld = true;
        } else {
            compromisedList.add(idNum);
            System.out.println("Agent's cover is blown.");
            secretCoverUpheld = false;
        } //end if statement
        return secretCoverUpheld;
    }//end IsCoverBlown

    //Prints the number of agents Undercover
    public int UnderListPrint() {
        underList = undercoverList.size();
        return underList;

    }

    //Prints the number of agents Compromised
    public int CompListPrint() {
        compList = compromisedList.size();
        return compList;

    }

    public static void main(String[] args) {
        Agent clientAgent = new Agent();
        //Generates Agents
        Agent ga[] = new Agent[10];
        for (int i = 0; i <= 9; i++) {

            //Prints Agents and Specs
            clientAgent.GenAgent();
        }//end loop
        clientAgent.PrintStatus();
    }//end main
}//end AgentLand