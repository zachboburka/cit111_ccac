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
package setsAndMaps;

import java.util.HashMap;
import java.util.Map;

/**
 * This program was used to practice creating and using sets and maps.
 * A country was chosen to visit and a map storing two strings was created.
 * Various attributes of the country were created including location, length,
 * and cost. 
 * @author zachary.boburka
 */
public class Expedition {
    //static members can be accessed without...
static Map<String, String> expeditionMap;

    public static void main(String[] args) {
        generateExpedMapData();
        
        // allow for user edits of individual values in the map
        // complete displays of all key:value pairs
    }//end main
     /**
      * Creates our map object and puts key/value pairs
      */
    public static void generateExpedMapData(){
        expeditionMap = new HashMap<>();
        expeditionMap.put("location", "guam");
        expeditionMap.put("length", "week:");
        expeditionMap.put("cost", "2000");
        expeditionMap.put("cost_units", "USD");
        expeditionMap.put("activity", "go fishing");
        expeditionMap.put("temperature", "90 degrees");
    }
        
    public static void viewContentsOfExpedMap() {
        
    }
    
}// end class