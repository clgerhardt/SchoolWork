//******************************************
//File: MyTrangle2
//
//Purpose:
//
//Input:
//Output:
//
//
//Author:   Christian Gerhardt
//Date:     1/20/2016 
//Course:   CIS1301B
//Program:  #2 MyTriangle2.java
  import java.util.Scanner;
  
   public class MyTriangle2{
   
      static double Side1;
      static double Side2;
      static double Side3;
      static double Perimeter;
      static double Area;
      static double s;
      
      public static void main (String [] args) {
          
          printHeader ();
          readSides ();
          calculations ();
          printOutput ();
          printFooter ();
   }
   public static void printHeader (){
   
         System.out.printf("\n******************************************************");
         System.out.printf("\n\t\t%-60s","Triangle Report");
         System.out.printf("\n\t\t%-60s","Christian Gerhardt");
         System.out.printf("\n\t\t%-60s","CIS1301");
         System.out.printf("\n\t\t%-60s","1/22/2016");
         System.out.printf("\n******************************************************");    
   }
   
   public static void readSides (){
   
         Scanner input = new Scanner ( System.in );
         System.out.print("\nEnter Side 1:");
         Side1 = input.nextDouble();
         System.out.print("Enter Side 2:");
         Side2 = input.nextDouble();
         System.out.print("Enter Side 3:");
         Side3 = input.nextDouble();      
   }
   
   public static void calculations (){
   
      Perimeter = (Side1 + Side2 + Side3);
      
      s = (Perimeter) * 1/2;
      
      Area = Math.sqrt(s*(s - Side1) * (s - Side2) * (s - Side3));
      
   }
   
   public static void printOutput (){
      System.out.printf("\n\t%-20s","Triangle Information");
      
      System.out.printf("\n\t%-20s%20.2f","Side 1:", Side1);
      System.out.printf("\n\t%-20s%20.2f","Side 2:", Side2);
      System.out.printf("\n\t%-20s%20.2f","Side 3:", Side3);
      
      System.out.printf("\n\n\t%-20s%20.2f","Perimeter", Perimeter);
      System.out.printf("\n\t%-20s%20.2f","Area", Area);
   }
   
   public static void printFooter (){
   
      System.out.printf("\n\n*****************************************************");
      System.out.printf("\n*******************Have a good day*******************");
      System.out.printf("\n*****************************************************");
   
   }
}
