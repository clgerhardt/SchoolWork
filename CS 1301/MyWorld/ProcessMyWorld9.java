import java.util.*;
import java.io.*;

/**
 * Make sure to document your code!
 */
public class ProcessMyWorld9
{
    private Scanner fileReader;
    private ArrayList <Country> countries = new ArrayList < >();

    /**
     * Constructor for objects of class ProcessMyWorld9
     * @param the name of the CSV file to be processed
     */
    public ProcessMyWorld9(String filename) throws IOException
    {
        fileReader = new Scanner(new File(filename));
      
        fileReader.nextLine(); //skip header
        while(fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] fields = line.split(",");       
            String country = fields[0];
            String continent = fields[1];
            long population = Long.parseLong(fields[2]);
            long area = Long.parseLong(fields[3]);  
            Country c = new Country(country, continent, population, area);
            countries.add(c);    
        }
        
    }

    public void displayMostPopulatedCountry()
    {
    
      
    }

    public void displayLargestCountry()
    {

    }
    
    public void displayWorldPopulation()
    {

    }
    
    public void displayContinentArea()
    {
      
    }
    
    public void displayContinentPopulation()
    {
               
    }
    
    public void displayLargestContinent()
    {
             
    }
    
    public void displayMostPopulatedContinent() 
    {
      
    }
}
 
