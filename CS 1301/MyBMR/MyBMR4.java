//******************************************
//File: MyBMR4
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
//Program:  #4 MyBMR4.java
//******************************************
import java.util.Scanner;

 public class MyBMR4 {
      
      static String gender;
      static char g;
      static double weight,height;
      static int age;
      static double BMR;
      static String activityLevel;
      static final int choc = 250;
      
      
      
      
      
      
   public static void main (String [] args){
   
         readInputs ();
        /* printHeader ();
         calculations ();
         printOutput ();
         printFooter ();
        */    
   }
   
   public static void readInputs () {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter your weight in pounds:  ");
        weight = input.nextDouble ();
        
        System.out.print("Enter your height in inches:   ");
        height = input.nextDouble ();
        
        System.out.print("Enter your age in years:   ");
        height = input.nextInt ();
        
        System.out.print("Enter your gender M, m, man, Man, W, w, or Woman:");
        gender = input.next();
        gender = gender.toUpperCase();
        g = gender.charAt(0);
            switch(g){
            
               case 'M': System.out.println ("Man ");
                        BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
                        break;
               case 'W': System.out.println ("Woman ");
                        BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
                        break;
                        
               default: System.out.println ("Invalid gender input:"); 
                        System.exit(0);
     
                     } 
                     
        System.out.print("Enter your activity level, Sedentary, Somewhat active, Active, or Highly active:");
        input.nextLine();
        activityLevel = input.nextLine();
        activityLevel = activityLevel.toUpperCase ();
        
        
         switch (activityLevel) {
        
            case "SEDENTARY":
                        BMR *= 1.2;
                      break;
                      
            case "SOMEWHAT ACTIVE":
                        BMR *= 1.3;
                       break; 
                       
            case "ACTIVE":
                        BMR *= 1.4;
                       break;
                       
            case "HIGHLY ACTIVE":
                        BMR *= 1.5;
                      break;
                      
            default: System.out.println("Invalid Input");
                     System.exit(0);
                     
                     
                     }


            
                        
                        
        
                    
   
   }
   
   /*public static void printHeader () {
      
      
        System.out.printf("\n\t**************************************");
   
   }
   
   public static void calculations () {
   
   }
   
   public static void printOutput () {
   
   
   }
   
   
   public static void printFooter () {
   
   
   }
   */
  
   
}
   