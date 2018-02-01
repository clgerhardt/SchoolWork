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
    int largest = -99999;
    
    //promte the user to assign value to n
    
    System.out.print ("Enter the number of items to read:\t");
    n = keyboard.nextInt();
    
    for (int i = 1; i<= n; ++i)
    {
      System.out.print ("Enter an integer value:\t");
      value = keyboard.nextInt();
      sum += value;
      
      if (value > largest)
         largest = value;
    }//end of for
    
    System.out.printf("\n\t%-30s%13.2f", "Average is:", (double)sum/n);
    System.out.printf("\n\t%-30s%10d", "Largest is:", largest);
     
    /*
    int n;//n is count or how many numbers we wanna read
    int value;
    int sum = 0;
    int largest = -99999;
    
    //promte the user to assign value to n
    
    System.out.print ("Enter the number of items to read:\t");
    n = keyboard.nextInt();
    
    for (int i = 1; i<= n; ++i)
    {
      System.out.print ("Enter an integer value:\t");
      value = keyboard.nextInt();
      
      if (value < 0)
         break;
         
      sum += value;
      
      
      if (value > largest)
         largest = value;
    }//end of for
    
    System.out.printf("\n\t%-30s%13.2f", "Average is:", (double)sum/n);
    System.out.printf("\n\t%-30s%10d", "Largest is:", largest);
     
     
     //mathclass methods 
     /*
     System.out.printf ("\n\t%-30s%13.2f","Math.pow(2,3):", Math.pow(2,3));
     System.out.printf ("\n\t%-30s%13.2f","Math.sqrt(2):", Math.sqrt(2));
     System.out.printf ("\n\t%-30s%13.2f","Math.PI:", Math.PI);
     System.out.printf ("\n\t%-30s%10d","Math.max(2,3):", Math.max(2,3));
     
    
     System.out.print ("Enter an integer score or -1 to quit:");
     value = keybaord.nextInt ();
     while (value != -1)
     {
         if (value > largest)
            largest = value;
         if (value < smallest)
            smallest = value;
            
     sum += value;
     
     }//end of while
      
      
      //double radius = 2.5
      //double area = Math.PI * radius * radius;
      
      
      //write a code that will display all the numbers from m to n
      
      int m,n;
      System.out.print ("Enter a value for m and n:\t");
      m = keyboard.nextInt();
      n = keyboard.nextInt();
      
      for (int i = m; i<= n; i++)
       System.out.print (i + "\t");
      */
   }//end of main

}//end of class

//write a code that will display all the numbers from m to n