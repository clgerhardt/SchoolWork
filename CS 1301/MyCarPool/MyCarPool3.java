//***************************************************
//File: MyCarPool3
//
//Purpose:
//
//Input:
//Output:
//
//
//Author:   Christian Gerhardt
//Date:     1/29/2016 
//Course:   CIS1301B
//Program:  #3 MyCarPool3.java
//***************************************************
import java.util.Scanner;
import java.util.Date;

public class MyCarPool3 {
   
     private static String yourName;
     private static String section;
     private static int tmpd;
     private static double cpg;
     private static double avg;
     private static double parkingFee;
     private static double tolls;
     private static int passengers;
     private static double tripCost;
     private static double personCost;
     private static final int WEEK = 5;
     private static final int MONTH = 22;
     private static final int YEAR = 260;
     private static double daily;
     private static double weekly;
     private static double monthly;
     private static double annual;
      
       
   public static void main (String [] args ){ 
         
         inputInfo ();
         printHeader ();
         calculations ();
         printOutput ();

   }
   
    public static void inputInfo (){
       
      Scanner input = new Scanner ( System.in );
      
      System.out.printf("Welcome to the Daily Driving Cost calculator");
      
      System.out.printf("\nEnter your name:  ");
      yourName = input.nextLine();
      yourName = yourName.toUpperCase ();
      
      System.out.print("Enter your class and section:  ");
      section = input.nextLine();
      section = section.toLowerCase ();
      
      System.out.print("Enter the number of miles you drive per day:");
      tmpd = input.nextInt ();
      
      System.out.print("Enter the cost per gallon of gas (ie., 2.25):  ");
      cpg = input.nextDouble ();
      
      System.out.print("Enter average miles per gallon of gas: ");
      avg = input.nextDouble ();
      
      System.out.print("Enter the parking fees per day: ");
      parkingFee = input.nextDouble ();
      
      System.out.print("Enter the tolls per day: ");
      tolls = input.nextDouble ();
      
      System.out.print("Enter the passengers: ");
      passengers = input.nextInt ();
          
      
   }
   
   public static void printHeader (){
         
         Date date = new Date ();
         
         System.out.printf("\n*************Car Pooling Report***********************");
         System.out.printf("\n\t\t%-60s%-60s","Name:" ,  "Christian Gerhardt");
         System.out.printf("\n\t\t%-60s%-60s","Course:", "CIS1301");
         System.out.printf("\n%-60s%44s","Date:", date.toString());
         System.out.printf("\n******************************************************");    
   }
    
   public static void calculations (){
   
      tripCost = tmpd / avg * cpg + tolls + parkingFee;
      
      personCost = tripCost / passengers;
      
      daily = tripCost - personCost;
      
      weekly = daily * WEEK;
      
      monthly = daily * MONTH;
      
      annual = daily * YEAR;
   }
   
   public static void printOutput (){ 
   
      System.out.printf("\n%-20s%-20d","Daily Miles Driven:" , tmpd);
      System.out.printf("\n%-20s%10.2f","Cost per gallon:" , cpg);
      System.out.printf("\n%-20s%10.2f","Average Miles Per Gallon:" , avg);
      System.out.printf("\n%-20s%10.2f","Parking fees:" , parkingFee);
      System.out.printf("\n%-20s%10.2f","Toll cost:" , tolls);
      System.out.printf("\n%-20s%-20d","Number Of Passengers:" , passengers);
      
      System.out.printf("\n%-20s%10.2f","Daily Trip Cost:" , tripCost);
      System.out.printf("\n%-20s%10.2f","One Passenger Daily Cost:" , personCost);
      System.out.printf("\n%-20s%10.2f","Daily Savings:" , daily);
      System.out.printf("\n%-20s%10.2f","Weekly Savings:" , weekly);
      System.out.printf("\n%-20s%10.2f","Monthly Savings:" , monthly);
      System.out.printf("\n%-20s%10.2f","Annual Savings:" , annual);
   
   }
   
   
}