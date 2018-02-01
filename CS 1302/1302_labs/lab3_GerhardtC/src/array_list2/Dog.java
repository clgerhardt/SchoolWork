package array_list2;

public class Dog {
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String bark() {
		return name + " is barking";
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog named " + name;
	}

}
