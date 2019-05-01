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
package Inheritance;

/*
This program practices nheritance by creating a parent student class then
extending it across mulitple classes representing the student moving from
elementary school to college, all sharing the same information.
*/
class Student {

    String name;
    String gender;
    int age;
    int studID;

}//Student

class ElemStudent extends Student {

    String allergies;
    int emergencyContactPhone;
}//elemStudent

class HSStudent extends Student {

    int grade;
    double GPA;
    boolean honorRoll;

    public boolean honorRollMethod() {
        if (GPA >= 3.0) {
            honorRoll = true;
        } else {
            honorRoll = false;
        }//end if
        return honorRoll;
    }//honorRollMethod

}//HSStudent

class CollegeStudent extends HSStudent {

    String major;
    boolean scholarship;

    public boolean scholarshipMethod() {
        if (GPA >= 4.0) {
            scholarship = true;
        } else {
            scholarship = false;
        }
        return scholarship;
    }//end scholarshipMethod

}//CollegeStudent

public class ParentalPractice {

    public static void main(String[] args) {
        Student stud = new Student();
        ElemStudent elemStud = new ElemStudent();
        HSStudent hsStud = new HSStudent();
        CollegeStudent collegeStud = new CollegeStudent();
        elemStud.name = "Crusoe";
        elemStud.allergies = "email, homework, peanut, math";
        elemStud.emergencyContactPhone = 1234561111;
        
        stud = elemStud;
        ElemStudent anotherElemStudVar;
        anotherElemStudVar = (ElemStudent) stud;

       
        if (collegeStud instanceof HSStudent) {
            //type class
            System.out.println("Student went to college");
        } else {
            System.out.println("Student didn't go to college");
        }//end if

    }//main

}//ParentalPractice
