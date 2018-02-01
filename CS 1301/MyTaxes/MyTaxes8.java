/*

      Document this class


*/

public class MyTaxes8
{
   public static void main (String [] args)
   {
        TaxCollector freedom2015 = new TaxCollector();
        
        Citizen poorCitizen = new Citizen("Akalobo", "TK", 100, 3, false);
        freedom2015.collect(poorCitizen);

        Citizen middleClassCitizen = new Citizen("Family Guy", "RF", 35000, 2, false);
        freedom2015.collect(middleClassCitizen);

        Citizen richCitizen = new Citizen("Ronald Rump", "XA", 1000000, 1, false);
        freedom2015.collect(richCitizen);
        
        Citizen expatCitizen = new Citizen("Ruhana", "NA", 75000, 2, true);
        freedom2015.collect(expatCitizen);
        
        freedom2015.displayCollectedTax();
    }
}


