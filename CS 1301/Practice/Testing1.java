public class Testing1{
public static void main (String [] args){
   //switch statements 
   
      /*char letter = 'w';
      switch (letter)
      {
      
         case 'A':
         case 'a': System.out.println ("Some kind if A.");
         case 'B':
         case 'b': System.out.println ("Some kind of B.");
                   break;
         default:  System.out.println ("Something else ");
                   break;
                   
       }//end of switch 
        
        
        String city = "Valdosta";
        boolean result;
        
        result = city.equals("Atlanta");
        
        System.out.printf ("\n\t%-30s%-10b","Result of city: ", result);
         */
         
         java.util.Scanner input = new java.util.Scanner (System.in);
         String gender;
         System.out.print("Enter your gender:");
         gender = input.next ();
         gender = gender.toUpperCase();
         char g = gender.charAt(0);
            switch(g){
            
               case 'M': System.out.println ("do man calculations here");
                        break;
               case 'W': System.out.println ("do man calculations here");
                        break;
                        
               default: System.out.println ("Invalid gender input"); 
                        System.exit(0);      

                    
                           
                         
              } 
              
              
      int startingValue = 0; 
      int terminatingValue = 9;
      int stepValue = 1   ;    


      for ( int i = startingValue; i <= terminatingValue; i += stepValue){
      if ( i % 2 == 0 )
      continue;
      if ( i == 9 )
      break;
      System.out.printf( "%d ", i );
      } // end for
            
               
   }

}