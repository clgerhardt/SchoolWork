//*************************************************************
//Purpose:  Test2b_3_10_2016_Lab
//
//Author:   
//Date:     3/10/2016
//Class:    CS1301
//*************************************************************
import java.util.*;
public class Test2b_3_10_2016_Lab{
   //Data Fields
   private String name = "unknown";
   private String course = "Unknown";
   private Date dateCreated; 
   
   //**********************************************************
   //q0: no-argument constructor. Assign your name to name, CS1301 to course,
   //                         and the system's date to dateCreated.
   //
   //DO NOT READ ANYTHING FROM KEYBOARD
   //**********************************************************
   public Test2b_3_10_2016_Lab (){
   
      name = "Christian";
      course = "CS1301";
      dateCreated = new Date();
      

   }
   
   //**********************************************************
   //q1: Write a method to print 
   //    all the odd integers from m to n, inclusive.
   //For example, if we pass 3 to m and 12 to n, the method should
   //display: 3,5,7,9, and 11
   //DO NOT READ ANYTHING FROM KEYBOARD
   //**********************************************************
   public void q1 (int m, int n){
   
     for (int i = m; i <= n; i++){
         if (i%2 == 1){
      System.out.printf ("%5d",i);
         }
      }
      System.out.println("");
   }
 
   //**********************************************************
   //q2: Write a method to display the values that are divisible 
   //    by k from m to n, inclusive. For example, if m is 5, 
   //    n is 17, and k is 7, the method should display 7 and 14.
   //DO NOT READ ANYTHING FROM KEYBOARD
   //**********************************************************
   public void q2 (int m, int n, int k){
         
        for (int i = m; i <= n; i++){
         if (i%k == 0){
         System.out.printf ("%5d",i);
         }
      }
      System.out.println("");
   }

   
   //**********************************************************
   //q3: Write a method to compute and return of the average of 
   //          all values from m to n, inclusive. For example, 
   //          if m is 1 and n is 6, the method should return 
   //          3.5 as the average.
   //DO NOT READ ANYTHING FROM KEYBOARD
   //**********************************************************
   public double q3 (int m, int n){
      
   double average = 0;
   int sum = 0;
   double total = 0.0;
   for (int i = m; i <=n; i++)
   {
      sum += i;
      total++;
   }
   average = sum / total;
   return average;  
   
   }
   
   //**********************************************************
   //q4: Write a method that returns the smallest of m and n.
   //DO NOT READ ANYTHING FROM KEYBOARD
   //**********************************************************
   public int q4 (int m, int n){
   
      int smallest = Math.min(m,n); 
      System.out.println("");
      return smallest; //update
      
   }

   //**********************************************************
   //q5: Write a method that receives the student status number and 
   //    returns the status name. 1 for Freshman, 2 for Sophomore, 
   //    3 for Junior, 4 for Senior, and Invalid for any other value 
   //DO NOT READ ANYTHING FROM KEYBOARD
   //**********************************************************
   public String q5 (int status){
   
      String statusName = " ";
       switch (status){
         case 1:  statusName = "Freshman";
                  break;
         case 2:  statusName = "Sophomore";
                  break;
         case 3:  statusName = "Junior";
                  break;
         case 4:  statusName = "Senior";
                  break;
         default: System.out.println ("Invalid Status number");
      }        
      System.out.println("");
      return statusName; 
   }

   //**********************************************************
   //q6: Write a method that accepts a string argument.
   //    counts the number of non-letters in the string.
   //DO NOT READ ANYTHING FROM KEYBOARD
   //**********************************************************
   public int countOfNonLetters(String str){
      
         int letters = 0;
         int digits = 0;
         int others = 0;
         char c;
         
         for (int i = 0; i < str.length(); i++)
         {
            c =str.charAt(i);
            if (Character.isLetter(c))
               letters++;
            else if (Character.isDigit(c))
               digits++;
            else
               others++;
               
         }
         
         return digits + others;
  }
  
  //**********************************************************
   //q7: Write a method that accepts a string argument.
   //    counts the number of digits (characters) (0, 1, ..., 9)
   //    in the string.
   //DO NOT READ ANYTHING FROM KEYBOARD
   //**********************************************************
   public int countOfDigits(String str){
   
         int digits = 0;
         
         char c;
         
         for (int i = 1; i < str.length(); i++)
         {
            c = str.charAt(i);
            if (Character.isDigit(c))
               digits++;
            else
               System.out.println("Invaid Entry");
              
               
         }
         System.out.println("");
      return digits;
   }
    
   //**********************************************************
   //q8: Write a method that accepts an integer argument n,
   //    and displays the pattern below if n is 5.
   //    *
   //    **
   //    ***
   //    ****
   //    *****
   //**********************************************************
   public void pattern (int n){
      
     		for (int i = 1; i <= 5; i++){
            System.out.println();
			for (int j = 1; j <= i; j++){
				System.out.print ("*" + " " );
         }
      } 
      System.out.println("");  
   }
    
   //**********************************************************
   //q9: Write a method that accepts a character and a string arguments.
   //    The method should return the location of the character in the string. 
   //    It returns 0 if the character occurs first in the string. It returns 
   //    a negative value if the string does not contain the character.
   //    If the string contains several occurrences of the character, the method
   //    could return the location of the first or the last occurrence. 
   //**********************************************************
   public int findCharacter (char c, String str){
     
      
      return -99; //update
   }
   
   //**********************************************************
   //10: Write a method that accepts three integer paramters,
   //    m, n, and k The method should display display k random 
   //    integers from m to n inclusive. the k values should
   //    printed on a single line with some spacing.For example,
   //    if we pass 2, 10, and 5, the method may display
   //    4  7   2   8  6
   //Note:  java.util.Random is imported at the top of the class. 
   //**********************************************************
   public void kRandomValues (int m, int n, int k)
   {
		Random rng = new Random();
		for (int i = 1; i <= k; i++){
			int value = rng.nextInt(n-m+1)+m;
			System.out.print (value + "\t");
	   }
      System.out.println("");
   }
  
   //**********************************************************
   //    toString method returns the values of the instance
   //    variables.
   //**********************************************************
   public String toString(){
      String result;
      result = "\n\tName:  \t" + name +
               "\n\tCourse:\t" + course +
               "\n\n\tDate: \t" + dateCreated;
      return result;
   }
}