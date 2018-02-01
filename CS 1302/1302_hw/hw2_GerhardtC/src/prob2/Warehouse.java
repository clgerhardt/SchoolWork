package prob2;

import java.util.*;

public class Warehouse {

	private ArrayList<Item> items = new ArrayList<>();

	public Warehouse() {

	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public int getNumItems() {
		/*
		 * int numItems = 0; for(Item e : item){ numItems++; } return numItems;
		 */
		int size = items.size();
		return size;
	}

	public ArrayList<RefrigeratedItem> getRefrigeratedItems() {
		ArrayList<RefrigeratedItem> getRefrigeratedItems = new ArrayList<>();
		for (Item e : items) {
			if (e instanceof RefrigeratedItem) {
				getRefrigeratedItems.add((RefrigeratedItem) e);
			}
		}
		return getRefrigeratedItems;
	}

	public double getTotalCost() {
		double totalCost = 0.0;
		for (Item e : items) {
			totalCost += e.cost();
		}
		return totalCost;
	}

	public double getTotalCostRefrigerated() {
		double totalCost = 0.0;
		for (Item e : items) {
			if (e instanceof RefrigeratedItem) {
				totalCost += e.cost();
			}
		}

		return totalCost;
	}

	public String toString() {
		String result = " ";
		for(Item e : items){
			if( e != null){
				result += e + "\n";
			}
		}
		return result;
	}
}
