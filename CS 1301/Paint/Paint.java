//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint{
public static void main(String[] args){
final int COVERAGE = 350;	//paint covers 350 sq ft/gal

      //declare integers length, width, and height;
      int length;     //room's length
      int width;      //room's width
      int height;     //room's height
      //declare double totalSqFt;
      double totalSqFt;
      //declare double paintNeeded;
      double paintNeeded;
      //declare and initialize Scanner object
      Scanner scan = new Scanner( System.in );
   
      //Prompt for and read in the length of the room
      System.out.print("Enter the length as integer:\t");
      length = scan.nextInt();
      //Prompt for and read in the width of the room   
      System.out.print("Enter the width as interger:\t");
      width = scan.nextInt();
      //Prompt for and read in the height of the room   
      System.out.print("Enter the height as interger:\t");
      height = scan.nextInt();

      //Compute the total square feet to be painted--think
      //about the dimensions of each wall
      totalSqFt = (length * height + width * height) * 2;
      //Compute the amount of paint needed
      paintNeeded = totalSqFt / COVERAGE;
      //Print the length, width, and height of the room and the
      //number of gallons of paint needed.
      
      System.out.printf("\n\t%-20s%7d","Length", length);
      System.out.printf("\n\t%-20s%7d","Width", width);
      System.out.printf("\n\t%-20s%7d","Height", height);  
      
      System.out.printf("\n\t%-20s%10.2f","Area", totalSqFt);
      System.out.printf("\n\t%-20s%10.2f","Paint Needed", paintNeeded);
          
      System.out.printf("\n**************************************");
      System.out.printf("\n\t%-20%","Painting a Room");
      System.out.printf("\n\t%-20%","Christian Gerhardt");
      System.out.printf("\n\t%-20%","Tue Jan 20 09:17:17 EST 2016");
      System.out.printf("\n**************************************");
      
   }
   
}
