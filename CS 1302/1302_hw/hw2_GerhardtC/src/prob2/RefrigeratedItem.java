package prob2;

public class RefrigeratedItem extends Item{
	protected double temp;
	
	public RefrigeratedItem(String name, double weight, double temp) {
		super(name, weight);
		this.temp = temp;
		
	}
	
	public double cost(){
		return super.cost() + (100.00 - temp) * 0.1;
	}

	public double getTemp(){
		
		return temp;
	}
	
	public String toString(){
		String result = String.format ("Name = %s, Cost = %.2f, Weight = %.2f, Temp = %.2f°" , getName() ,  cost() , getWeight() , getTemp());
		
		return result;

	}
}