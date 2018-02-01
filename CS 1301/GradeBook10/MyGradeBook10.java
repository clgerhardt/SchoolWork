//*********************************************************************
//Purpose:  
//
//Input:
//Output:
//                Document class and methods
//Author:
//
//Course:
//
//Date:
//
//Program:
//*********************************************************************

import java.io.*;
import java.util.Scanner;
public class MyGradeBook10
{ 
   // main method begins program execution
   public static void main(String[] args)throws IOException
   {
      //Declare the input file
      File infile = new File ("data10.txt");
      Scanner scan = new Scanner (infile);
      
      //Create an object of GradeBook10
      GradeBook10 myGradeBook = new GradeBook10(scan,
         "CS1301 Programming I", 20);
         
      System.out.printf("Welcome to the grade book for%n%s%n%n", 
         myGradeBook.getCourseName());
      
      myGradeBook.processGrades();
   } 
} // end class MyGradeBook10