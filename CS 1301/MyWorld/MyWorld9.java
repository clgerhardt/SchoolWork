
/*************************************************************************
 *Purpose:     Driver to test WorldStat Class to compute the following:
 *             1. World population
 *             2. Most populated country
 *             3. Largest contry
 *             4. Most populated continent
 *             5. Most populated continent
 *             6. Continents with their areas
 *             7. Continents with their population
 *
 *Author:      <Enter your name>
 *
 *Course:      <Enter your course>
 *
 *Date:        <Enter current date>  
 *************************************************************************   
 */
public class MyWorld9
{
    public static void main (String[] args) throws Exception
    {
        ProcessMyWorld9 world = new ProcessMyWorld9("world.csv");
        world.displayWorldPopulation();
        System.out.println("---- ---- ----");
        world.displayMostPopulatedCountry();
        System.out.println("---- ---- ----");
        world.displayLargestCountry();
        System.out.println("---- ---- ----");
        world.displayContinentPopulation();
        System.out.println("---- ---- ----");
        world.displayContinentArea();
        System.out.println("---- ---- ----");
        world.displayMostPopulatedContinent() ;
        System.out.println("---- ---- ----");
        world.displayLargestContinent();
    }
}