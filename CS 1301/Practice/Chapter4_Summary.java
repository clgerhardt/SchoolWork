//******************************************************
//Purpose:  Summary of Chapter4
//
//Author:   Fares
//Date:     2/1/2016
//Course:   CS1301
//Program:  Chapter4_Summary.java
//*****************************************************
import java.util.Scanner;
import java.util.Random;
public class Chapter4_Summary
{
   public static void main (String[] args)
   {
     readingString();            //Reading strings from Console
     stringMethods();            //Common string methods
     stringObjectMethods();      //Simple methods for String Objects 
     characterMethods();         //Common Character methods
     formatOutput();             //Formatting output, using printf
     mathClassMethods();         //Common Math class methods
     randomClassMethods();       
      
   }
   
   //*************************************************
   //1. readingString:  reads strings from keyboard
   //*************************************************
   public static void readingString ()
   {
      //Create an object out of the Scanner class
      Scanner scan = new Scanner (System.in);
      String word;
      String line;
      
      System.out.print ("Enter a word;\t");
      word = scan.next ();
      scan.nextLine();
      
      System.out.print ("Enter a line;\t");
      line = scan.nextLine ();
       
      System.out.printf ("\n\t%-30s%-20s", "the word is:",word);
      System.out.printf ("\n\t%-30s%-20s", "the line is:",line);
         
   }//end of readingString
   
   //*************************************************
   //2. stringMethods:  apply some common string methods
   //*************************************************
   public static void stringMethods ()
   {
      //Declarations
      String str1 = "CS1301A Spring 2016";
      String str2 = "Valdosta";
      String str3, str4;
      String str5 = "    Computer Science    ";
      String str6;
      int index;
      
      //indexOf(s);
      System.out.printf ("\n\t%-40s%-30s", "Scale", "0123456789012345678901234567890");
      System.out.printf ("\n\t%-40s%-30s", "Original str1", str1); 
      
      index = str1.indexOf("2016");
      System.out.printf ("\n\t%-40s%20d","The index of 2016 is:", index);
      
      index = str1.indexOf("2017");
      System.out.printf ("\n\t%-40s%20d","The index of 2016 is:", index);
      
      index = str1.indexOf("2017", 5);
      System.out.printf ("\n\t%-40s%20d","The index of 2016 is:", index);
      
      System.out.println ("\n\t2.\tImplement stringMethods");
         
   
   }//end of stringMethods
   
   //*************************************************
   //3. stringObjectMethods:  apply some common string methods
   //*************************************************
   public static void stringObjectMethods ()
   {
      //Declarations
      String str1 = "Atlanta";
      String str2 = "Valdosta";
      String str3 = "VALDosta";
      String str4, str5, str6;
      int index;
      
      System.out.printf ("\n\t%-30s%-30s", "Scale", "0123456789012345678901234567890");
      System.out.printf ("\n\t%-30s%-30s", "Original", str1);
      System.out.printf ("\n\t%-30s%-30s", "Original str2", str2);
      System.out.printf ("\n\t%-30s%-30s", "Original str3", str3);
      
      index = str1.length();
      System.out.printf ("\n\t%-30s%10d", "str1 length is", index);
      
      char c = str1.charAt (4);
      System.out.printf ("\n\t%-30s%10c", "str1.charAt (4) is", index);
      
      str4 = str1 + "\t" + str2;
      System.out.printf ("\n\t%-30s%-30s", "str1 + str2", str4);
      System.out.printf ("\n\t%-30s%-30s", "str1.concat(str2)", str1.concat(str2));
      
      str5 = str1.substring(2,5);
      System.out.printf ("\n\t%-30s%-30s", "str1.substring(str2)", str5);

      System.out.println ("\n\t3.\tImplement stringObjectMethods" );
      
      str6 = "    computer   science   ";
      index = str6.length();
      System.out.printf ("\n\t%-30s%10d", "str6 length is", index);
      
      
  
   }//end of stringObjectMethods


    //*************************************************
   //4. characterMethods  apply some common Character methods
   //*************************************************
   public static void characterMethods ()
   {
   
      //declarations
      char c1 = 'A';
      char c2 = 'b';
      char c3 = 'W';
      char c4 = '5';
      boolean b1;
      String str1;
      
      //isDigit
      System.out.printf ("\n\t%-40s%-30c", "Original c1", c1);
      System.out.printf ("\n\t%-40s%-30c", "Original c2", c2);
      System.out.printf ("\n\t%-40s%-30c", "Original c3", c3);
      System.out.printf ("\n\t%-40s%-30c", "Original c4", c4);
      
      
      System.out.printf ("\n\t%-40s%-30b", "Character.isDigit(c1)", Character.isDigit(c1));
      System.out.printf ("\n\t%-40s%-30b", "Character.isLetter(c1)", Character.isLetter(c1));
      System.out.printf ("\n\t%-40s%-30b", "Character.isLetterOrDigit(c1)", Character.isLetterOrDigit(c1));
      System.out.printf ("\n\t%-40s%-30b", "Character.isUpperCase(c1)", Character.isUpperCase(c1));
      
      
      str1 = Character.toString ('7');
      System.out.printf ("\n\t%-40s%-30s", "str1 is ", str1);       
   }//end of characterMethods

    //*************************************************
   //5. formatOutput:  Using printf to format output
   //*************************************************
   public static void formatOutput ()
   {
   
      int v1 =2;
      int v2 =12345;
      double d1 = 2.5;
      double d2 = 1234.7654;
      String str1 = "Valdosta";
      boolean b = false;
      char c = 'W';
      
      System.out.printf ("\n\t%-30s%10d", "V1 is:", v1);
      System.out.printf ("\n\t%-30s%10d", "V2 is:", v2);
      System.out.printf ("\n\t%-30s%13.2f", "D1 is:", d1);
      System.out.printf ("\n\t%-30s%13.2f", "D2 is:", d2);
      System.out.printf ("\n\t%-30s%10b", "B is:", b);
      System.out.printf ("\n\t%-30s%-10s", "str1 is:", str1);
      System.out.printf ("\n\t%-30s%10c", "c is:", c);






      System.out.println ("\n\t5.\tImplement formatOutput method");
   }//end of formatOutput

   //*************************************************
   //6. mathClassMethods:  Common Math methods
   //*************************************************
   public static void mathClassMethods ()
   {
   
      int v1 =2;
      int v2 = 5;
      int v3 = 4;
      int v4, v5,v6;
      double d1 = 12.75;
      double d2, d3;
      
      //orignal values
      System.out.printf ("\n\t%-30s%10d","Orignal V1", v1);
      System.out.printf ("\n\t%-30s%10d","Orignal V2", v2);
      System.out.printf ("\n\t%-30s%10d","Orignal v3", v3);
      System.out.printf ("\n\t%-30s%13.2f","Orignal d1", d1);
      
      //calculations
      System.out.printf ("\n\t%-30s%10d","Math.max(v1,v2)", Math.max(v1,v2));
      System.out.printf ("\n\t%-30s%10d","Math.min(v1,v2)", Math.min(v1,v2));
      System.out.printf ("\n\t%-30s%13.5f","Math.pow(v1,v2)", Math.pow(v1,v2));
      System.out.printf ("\n\t%-30s%13.5f","Math.sqrt(v1,v2)", Math.sqrt(v1));
      
      System.out.printf ("\n\t%-30s%13.5f","Math.PI", Math.PI);
      System.out.printf ("\n\t%-30s%13.5f","Math.E", Math.E);
      
      for (int i =1; i < 6; i++)
      System.out.printf ("\n\t%6.3f", Math.random());

      
    
        }//end of mathClassMethods
      	
				
   //*************************************************
   //7. randomClassMethods:  Common Random class methods
   //*************************************************
   public static void randomClassMethods ()
   {
     System.out.println ("\n\t7.\tImplement randomClassMethods");
   }//end of mathClassMethods

}