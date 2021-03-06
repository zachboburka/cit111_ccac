/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;
import java.util.Scanner;

/**
 * This program lets the user choose the dimensions of three 3d shapes and then
 * calculates and displays the volume.
 * @author zachary.boburka
 */
public class Volume {
    public static void main(String[] args) {
        
        //Volume of CUBE
        //get the side length from the user
        System.out.println("Enter the side length of the cube to calculate its volume :");
        //scanner
        Scanner ScanVolume = new Scanner(System.in);
            double cubeVolume = ScanVolume.nextDouble();
  
        //call calcVolumeofCube here
        System.out.println("Volume of cube with side length " + cubeVolume + " is " + calcVolumeOfCube(cubeVolume));
        
        
        
            //Volume of CYLINDER
            //get the radius from the user
                System.out.println("Enter the radius of the cylinder :");
            //Scanner
                Scanner ScanCylinderRad = new Scanner(System.in);
                    double cylinderRad = ScanCylinderRad.nextDouble();
                    
            //get the height of the cylinder
                System.out.println("Enter the height of the cylinder :");
            //Scanner    
                Scanner ScanCylinderHeight = new Scanner(System.in);
                    double cylinderHeight = ScanCylinderHeight.nextDouble();
            
            //call calcVolumeOfCylinder
                System.out.println("The Volume of a Cylinder with a radius of " + cylinderRad + "\nand with a height of " + cylinderHeight + " is " + calcVolumeOfCylinder(cylinderHeight, cylinderRad));        
        
                    //Volume of RIGHT RECTANGULAR PRISM
                    //get the legnth from the user 
                       
                        System.out.println("Enter the Legnth of the Rectangular Prism :");
                    //Scanner
                        Scanner ScanRecLegnth = new Scanner(System.in);
                            double recLength = ScanRecLegnth.nextDouble();
                    
                    
                    //get the width from the user
                        System.out.println("Enter the Width of the Rectangular Prism :");
                    //Scanner
                        Scanner ScanRecWidth = new Scanner(System.in);
                            double recWidth = ScanRecWidth.nextDouble();
                    
                    
                    //get the height from the user
                    System.out.println("Enter the Height of the Rectangular Prism :");
                    //Scanner
                        Scanner ScanRecHeight = new Scanner(System.in);
                            double recHeight = ScanRecHeight.nextDouble();
                    
                //call calcVolumeOfRec
                    System.out.println("The Volume of a Right Rectangular Prism with a legnth of " + recLength
                                        + ", a width of " + recWidth + ", and a height of " + recHeight + " is "
                                        + calcVolumeOfRec(recLength, recWidth, recHeight));
    
    }//close main
    
    
    
    //METHODS
//cube method    
    public static double calcVolumeOfCube(double sideLength) {
        //raise side legnth to 3 and return the result
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume; 
    }//close calcVolumeOfCube
//cylinder method    
    public static double calcVolumeOfCylinder(double height, double radius) {
        //delcare variable for PI
        final double PI = 3.1416;
        
        //calculate volume
        double cylinderVolume = PI * (radius * radius) * height;
        return cylinderVolume; 
    }//close calcVolumeOfCylinder
    
//Right Rectangular Prism
    public static double calcVolumeOfRec(double recLength, double recWidth, double recHeight) {        
        //calculate volume
        double recVolume = recLength * recWidth * recHeight;
        return recVolume; 
    }//close calcVolumeOfPrism
}//close class