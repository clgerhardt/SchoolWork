//*********************
//Purpose: compute the area and perimeter
//         of a circle
//Input:   Reading radius from key
//Output:  Radius, area, and perimeter
//
//*********************
import java.util.Scanner;
public class MyCircle {
   //static variables 
   static int radius;
   static double area;
   static double circumference;
   
   //main method
   public static void main (String [] arg) {
      readRadius();
      calculations();
      printOutput();
      
  }    
      
    //readRadius: reading the radius 
    public static void readRadius(){
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter the radius as an integer:\t");
        radius = input.nextInt();
   }

    //calculations: computes area and cironference 
    public static void calculations () {
      //area = Math.PI * radius * radius;
       area = Math.PI * Math.pow(radius,2);
       circumference =   2 * radius * Math.PI;
    } 
    
    //output
    public static void printOutput() {
    System.out.println ("\nThe radius is;\t" + radius);
    System.out.println ("\nThe area is;\t" + area);
    System.out.println ("\nThe circumference is;\t" + circumference);
    }
    
}