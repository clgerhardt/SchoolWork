
public class StringPrograms {
   public static void main (String [] args){
   
      
     
         String str = "CS 1301 A and C";
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
         System.out.printf("\n\t%-30s%10d","Number of letters is", letters);
         System.out.printf("\n\t%-30s%10d","Number of digits is", digits);
         System.out.printf("\n\t%-30s%10d","Number of others is", others);
      
   
   }
   
}