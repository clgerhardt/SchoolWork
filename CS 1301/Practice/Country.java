/*************************************************************************
 *Purpose:     Creates the entry of the entry of the ArrayLists with accessors.
 *
 *Author:      <Enter your name>
 *
 *Course:      <Enter your course>
 *
 *Date:        <Enter current date>  
 *************************************************************************   
 */
public class Country{
   private String countryName;
   private String continentName;
   private long countryPopulation;
   private long countryArea;
     
   public Country(String countryName, String continentName, long countryPopulation, long countryArea){
   
      this.countryName = countryName;
      this.continentName = continentName;
      this.countryPopulation = countryPopulation;
      this.countryArea = countryArea;
   }
 
   public String getCountryName(){

      return countryName; 
   }
   
   public String getContinentName(){
      
      return continentName;
   }
  
   public long getCountryPopulation(){

      return countryPopulation; 
   }
  
   public long getCountryArea(){

      return countryArea; 
   }

   public String toString(){
      String result = "\n\tCountry Name:       \t" + countryName +
                      "\n\tContinent Name:     \t" + continentName +
                      "\n\tCountry Population: \t" + countryPopulation +
                      "\n\tCountry Area:       \t" + countryArea; 
      return result;
   }
}
 