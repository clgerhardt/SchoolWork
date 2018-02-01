package prob2;

public class WarehouseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Warehouse***");
		Warehouse w = new Warehouse();
		w.addItem(new Item("Fork", 3.00));
		w.addItem(new Item("Spoon", 4.00));
		w.addItem(new Item("Knife", 3.50));
		Item Ri = new RefrigeratedItem("Pickles",4.00,30);
		//System.out.println( Ri );
		w.addItem(Ri);
		Item Ri1 = new RefrigeratedItem("Soda",3.00,35);
		Item Ri2 = new RefrigeratedItem("Tea", 4.50, 70);
		w.addItem( Ri1 );
		w.addItem( Ri2 );
		System.out.println( w );
		System.out.println("Total Cost Of Items");
		System.out.printf("$%.2f\n" , w.getTotalCost());
		System.out.println("\nList Of Refrigerated Items");
		System.out.println(w.getRefrigeratedItems());
		System.out.println("Total Cost Of Refrigerated Items");
		System.out.printf("$%.2f\n" , w.getTotalCostRefrigerated());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
