package prob2;

public class Item{

	protected String name;
	protected Double weight;
	
	public Item (String name, double weight){
		this.name = name;
		this.weight = weight;
		
	}
	
	public double cost(){
		
		return (2.00 * weight);
	}
	
	public String getName(){
		
		return name;
	}
	
	public double getWeight(){
		
		return weight;
	}
	
	public String toString(){
		String result = String.format("Name = %s, Cost = %.2f, Weight= %.2f" , getName() , cost() , getWeight());
		
		return result;
	}
}

