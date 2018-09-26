package controlstructures;
    import java.util.Scanner;

/**
 * Friend Picker using
 * if statements
 * @author Zach Boburka
 */
public class MightWeBeFriends { 
    public static void main(String[] args){
        //Intro Statements
        System.out.println("Might We Be Friends?");
        System.out.println(" ");
        System.out.println("Answer using yes or no.");
        System.out.println(" ");
        
        //ints
        int earnedPoints = 0;
        
        //Strings
        String age;
        String hipHop;
        String videoGames;
        String party;
        

        //Friend Picker
        
        System.out.println("Are you between the ages of 16 and 20?");
               
        Scanner ScanAge = new Scanner(System.in);
        age = ScanAge.next();
        
        if(age.equals("yes")){            
            earnedPoints = earnedPoints + 1;
            System.out.println("Great!");
        } else {
            earnedPoints = earnedPoints + 0;
            System.out.println("That's a shame.");
        } // Closes Question 1
        
        
            //Starts Question 2
            System.out.println("Do you like hip hop music?");
        
            Scanner ScanHipHop = new Scanner(System.in);
            hipHop = ScanHipHop.next();
        
            if(hipHop.equals("yes") ){            
                earnedPoints = earnedPoints + 1;
                System.out.println("Great!");
            } else {
                earnedPoints = earnedPoints + 0;
                System.out.println("That's a shame."); 
            } // Closes Question 2
        
            
            
                //Starts Question 3    
                System.out.println("Do you play video games?");
                
                Scanner ScanVideoGames = new Scanner(System.in);
                videoGames = ScanVideoGames.next();
                
                if(videoGames.equals("yes") ){            
                    earnedPoints = earnedPoints + 1;
                  
                } else {
                    earnedPoints = earnedPoints + 0;
                    System.out.println("That's a shame."); 
                } // Closes Question 3
        
                    //Starts Question 4
                    System.out.println("Do you like to party?");

                    Scanner ScanParty = new Scanner(System.in);
                    party = ScanParty.next();
                
                    if(party.equals("yes")){            
                        earnedPoints = earnedPoints + 1;
                        System.out.println("Great!");
                    } else {
                        earnedPoints = earnedPoints + 0;
                        System.out.println("That's a shame.");   
                    } //Closes Question 4
                    
                    
        //Output
        System.out.println("Final point total : " + earnedPoints);
        
        if (earnedPoints >= 2 ) {
            System.out.println("Sick, We Might Be Friends!");  
        } else {
            System.out.println("Damn, We Probably Won't Be Friends");
        } //Closes Output
        
    } //Closes Main
} //Closes Class
