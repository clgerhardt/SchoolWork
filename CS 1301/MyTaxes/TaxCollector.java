/*
 *********************************************************
 * Purpose: Write a description of class TaxCollector here.
 * 
 *Author: 
 *
 *********************************************************
 */
 
public class TaxCollector
{
    // total collected tax by the agency
    private double collectedTax;
    
    /**
     * Constructor for objects of class TaxCollector
     */
    public TaxCollector()
    {
        collectedTax = 0.0;
    }

    /**
     * This method displays the total tax collected
     */
    public void displayCollectedTax() {
        System.out.println("Our beloved King, RRS has collected " + collectedTax + " this year");
    }    
    
    /**
     * In this class you need to address the tasks below.
     * Make sure to use several methods by dividing the task into several sub-tasks
     * 1 computes x.getIncome tax
     * 2 reduces x.getIncome tax by deductions
     * 3 adds social services tax
     * 4 deducts the tax from the x.getIncome of the citizen
     * 5 informs the citizen about the collected tax
     * 6 updates the total collected tax
     */
    public double incomeTax(Citizen x) // handles income tax and deductions
    { 
      double tax = 0;
    
     if (x.getIncome() >= 0 && x.getIncome() <= 25000){
         tax = x.getIncome()*0.10; // 10% of the income
         double newIncome = x.getIncome() - tax;
         return tax;       
     }
     
      
     else if(x.getIncome() >= 25000.01 && x.getIncome() <= 75000){
         tax = x.getIncome()*0.20; // 20% of the income
         double newIncome = x.getIncome() - tax; 
         return tax;         
        }
          
     else{ 
         tax = x.getIncome()*0.30; // 30% of the income
         double newIncome = x.getIncome() - tax;
       }
       return tax;
    }
     public double deductions(Citizen x)// applies deductions to income tax
     {
         double deductions = 0;
         
         if(x.getExpat()== false)
         switch(x.getDependents())
         {
          case 0: 
                 deductions = 0;
                break;
          case 1:
                 deductions = 500;
                break;
          case 2:
                 deductions = 800;
                break;
          default: deductions = 1000;
          }
          return deductions;
      }
     public double socialServices(Citizen x) // applies the tax of social services state tax
     {
         switch(x.getState()) 
         {
            case "TK": 
                     return x.getIncome()*.075; 
            case "RF":
                     return x.getIncome()*.065;
            case "XA":
                      return x.getIncome()*.06;
            default: return x.getIncome()*.07;  
                  
         }
       
     }
      public void collect(Citizen x)
      {
         collectedTax = 0;
         collectedTax += incomeTax(x);
         collectedTax -= deductions(x);
         collectedTax -= socialServices(x);
         x.setTax(collectedTax);
         System.out.println(x);
         
      }
} // parse code
