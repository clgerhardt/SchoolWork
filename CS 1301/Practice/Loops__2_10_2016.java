import java.util.Scanner;
public class Loops_2_10_2016
{

   public static void main (String []args)
   {
    
    //write the code to read n interger values
    //compute the average
    //create an object of the Scanner class
    Scanner keyboard = new Scanner (System.in);
    int n;//n is count or how many numbers we wanna read
    int value;
    int sum = 0;
    
    //promte the user to assign value to n
    
    System.out.print ("Enter the number of items to read:\t");
    n = keyboard.nextInt();
    
    for (int i = 1; i<= n; ++i)
    {
      System.out.print ("Enter an integer value:\t");
      value = keyboard.nextInt();
      sum += value;
    }//end of for
    
    System.out.printf("\n\t%-30s%13.2f", "Average is:", (double)sum/n);

   }//end of main

}//end of class