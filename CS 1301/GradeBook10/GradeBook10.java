//***********************************************************************
//Purpose:
//
//Author:
//                Document class and methods
//Course:
//
//Date:
//
//Program:
//***********************************************************************

import java.util.*;
public class GradeBook10
{
   private String courseName; // name of course this GradeBook represents
   private String [] names;   //holds student names
   private int[] grades;      // holds student grades
   
   //********************************************************************
   // constructor:   receives the input file name, coursse name, and class size
   //                It uses the class size to create the names and grades arrays
   //                It reads student records and assigns them to 
   //                names and grades arrays
   //                Also, it assigns course name to courseName
   //********************************************************************
   public GradeBook10(Scanner scan, String courseName, int classSize)
   {
      names = new String[classSize];
      grades = new int [classSize];
      this.courseName = courseName;
      int i = 0;
      while (scan.hasNext() && i < names.length){
         names[i] = scan.next();
         grades[i] = scan.nextInt();
         i++;
      }
   } 
   //********************************************************************
   //Mutator setCourseName method to set the course name
   //********************************************************************
   public void setCourseName(String courseName)
   {
      this.courseName = courseName; 
   } 
   
   //********************************************************************
   //Accessor getCourseName method to retrieve the course name
   //********************************************************************
   public String getCourseName()
   {
      return courseName;
   } 
   
   //********************************************************************
   //processGrades: perfroms various operations on the data:
   //1) invokes the outputGrades method
   //2) invokes the getAverage method calculate the average grade
   //3) invokes the getMinimum and getMaximum methods
   //4) invokes the outputBarChart method
   //********************************************************************

   public void processGrades()
   {
      //To be implemented
      
      //invokes the outputGrades method to display student namesand grades 
      
      //invokes getAverage method to print class average      
       
      //invokes getMinimum and getMaximum methods to print lowest and highest grades
     
      //invokes the outputBarChart method to print grade distribution chart
      outputGrades();
   } 

   // find minimum grade
   public int getMinimum()
   { 
      int minimum = grades[0];
         for(int i = 1; i < grades.length; i++){
            if(grades[i] < minimum){
               minimum = grades[i];
            }
         }	
     	return minimum; 
   } 

   // find maximum grade
   public int getMaximum()
   { 
      int maximum = grades[0];
         for(int i = 1; i < grades.length; i++){
            if(grades[i] > maximum){
               maximum = grades[i];
            }         
         }        
		return maximum;
   } 

   // determine average grade for test
   public double getAverage()
   {      
      int total = 0;
      for(int i = 0; i < grades.length; i++)
          total += grades[i];
      
      
     return (double)total/grades.length;
   } 

   // output bar chart displaying grade distribution
   public void outputBarChart()
   {
       //To be implemented
       
   } 

   // output the contents of the grades array
   public void outputGrades()
   {   
      System.out.printf("\n%10s%10s%10s", "Number", "Name", "Grades");
      for(int i = 0;i < names.length; i++)
       System.out.printf ("\n%-10d%-10s%-10d", (i+1), names[i],grades[i]);
        
       System.out.printf("\n%d", getMinimum());
       System.out.printf("\n%d", getMaximum());
       System.out.printf("\n%f", getAverage());
      
   } 
} // end class GradeBook