public class MyPatterns6 {
	public MyPatterns6() {
	}
	
	public void displayPatternI(int lines) {
			System.out.println("\n\tPattern I\n");
			for (int i = 1; i <= lines; i++){
				for (int j = 1; j <= i; j++){
					System.out.print (j + " " );
            }
			   System.out.println();
		   }
	}
 
 	public void displayPatternII (int lines) {
  		System.out.println("\n\tPattern II\n");
      for (int i = lines; i >= 1; i--){
         for (int j = i; j>=1;j--){
         System.out.print(j + " ");
            }
            System.out.println();
       }
	}

 	public void displayPatternIII (int lines) {
  		System.out.println("\n\tPattern III\n");
      
      for (int i = 1; i <= lines;i++){
        System.out.println();
         for (int s = 1; s <= lines - i;s++)
           System.out.print(" ");
           
         for (int d = lines - i + 1; d <= lines; d++)
           System.out.print(d);
         
      }
	}


	public void displayPatternIV (int lines) {
  		System.out.println("\n\tPattern IV\n");
      
       for (int i = 1; i <= lines;i++){
        System.out.println();
         for (int s = 1; s <= lines - i;s++)
           System.out.print(" ");    
         for (int d = 1; d <= i; d++)
           System.out.print(d);
         
      }
	}

	public void displayPatternV (int lines) {
  		System.out.println("\n\tPattern V\n");
      
    for(int i = 1;i <= lines;i++){
           System.out.println();
         for (int s = 1; s <= lines - i;s++)
           System.out.print(" ");    
         for (int d = 1; d <= i; d++)
           System.out.print(d);
         for (int j = i-1 ; j > 0; j--){
			  System.out.print (j);
         }
       }   
                
      }

	public void displayPatternVI (int lines) {
  		System.out.println("\n\tMy Own Pattern to be implemented\n");
	   for(int i = 1;i <= lines;i++){
         System.out.println();
         for (int s = 1; s <= lines - i;s++)
         System.out.print(" ");
         for (int d = 1; d <= i-1; d++)
           System.out.print(d);
		
	   }
   }
}