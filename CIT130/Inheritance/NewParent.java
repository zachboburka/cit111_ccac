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

/*
This program uses inheritance to impliment the logic used in ParentalPractice
*/
class Student {
    String name = "Zach";
    String gender = "Male";
    int age = 19;
    int studID = 1392273;
    String es1;
    String hs1;
    String cs1;
    
}//Student

class ElemStudent extends Student {
    String allergies;
    String emergencyContactPhone;

    public String ElemStudent(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
        System.out.println("Student ID : " + studID);
        System.out.println("Allergies : " + allergies);
        System.out.println("Emergency Contact Phone : " + emergencyContactPhone);
        return es1;
    }// end printElem
}//elemStudent

class HSStudent extends Student {
    int grade = 13;
    double GPA = 3.25;
    boolean honorRoll = true;

    public boolean honorRollMethod() {
        honorRoll = GPA >= 3.0; //end if
        return honorRoll;
    }//honorRollMethod
    public String HSStudent(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
        System.out.println("Student ID : " + studID);
        System.out.println("Grade : " + grade);
        System.out.println("GPA : " + GPA);
        System.out.println("Honor Roll : " + honorRoll);
        return hs1;
    }// end printHS
}//HSStudent

class CollegeStudent extends HSStudent {
    String major = "CS";
    boolean scholarship = false;

    public boolean scholarshipMethod() {
        scholarship = GPA >= 4.0;
        return scholarship;
    }//end scholarshipMethod
    
    void CollegeStudent(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
        System.out.println("Student ID : " + studID);
        System.out.println("Major : " + major);
        System.out.println("Scholarship? : " + scholarship);
    }// end printCollege
}//CollegeStudent

public class NewParent {

    public static void main(String[] args) {
        Student[] studs = new Student[3];
        studs[0] = new ElemStudent();
        studs[1] = new HSStudent();
        studs[2] = new CollegeStudent();
        
        
        
      //user interaction 
        System.out.println("Pick a Student");
        int studPicked;
        
        //Scanner
        Scanner ScanStud = new Scanner(System.in);
            studPicked = ScanStud.nextInt();
            
        //User Interaction
        //for loop
    for(int i = 0; i <= 2; i=i+1){
        Student accessedStud = studs[i];
        System.out.println("Accessed student : " + accessedStud);
        
        
    }//end for
    
        
   
        //Prints picked student
        System.out.println(studs[studPicked]);
    }//main
}//ParentalPractice